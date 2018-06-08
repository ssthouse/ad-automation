package com.ssthouse.adautomation.account;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

import com.ssthouse.adautomation.account.bean.Customer;
import com.ssthouse.adautomation.account.repository.CustomerRepository;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class LwaController {

    @Autowired
    CustomerRepository customerRepository;

    private static final String CLIENT_ID = "amzn1.application-oa2-client.145a35b2a67449a391547634050ffd6b";
    private static final String CLIENT_SECRET = "3ece764fb57718f9bdc647aef3640df8bef0fbba5712c6072eb0055e500caf2d";

    @RequestMapping(value = "signup")
    public String signup(@RequestParam(name = "access_token") String accessToken) {
        System.out.println(accessToken);
        try {
            getUserProfile(accessToken);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Get user profile fail!!!!!!!!!!!!");
        }
        return "redirect:/index.html";
    }

    @RequestMapping(value = "registerCustomer")
    @ResponseBody
    public String registerCustomer() {
        testMongo();
        log.info("successfully register a Customer!");
        return "ok";
    }

    private void testMongo() {
        testCreateUser();
        testQueryCustomer();
    }

    private void testCreateUser() {
        customerRepository.save(new Customer("testAmazonId1", "sst", "sstMail"));
    }

    private void testQueryCustomer() {
        Customer customer = customerRepository.findByEmail("sstMail");
        System.out.println(customer.toString());
    }

    private void getUserProfile(String accessToken) throws IOException {
        // verify that the access token belongs to us
        Content c = Request
                .Get("https://api.amazon.com/auth/o2/tokeninfo?access_token=" + URLEncoder
                        .encode(accessToken, "UTF-8"))
                .execute()
                .returnContent();

        Map m = new ObjectMapper().readValue(c.toString(), Map.class);

        if (!CLIENT_ID.equals(m.get("aud"))) {
            // the access token does not belong to us
            throw new RuntimeException("Invalid token");
        }

        // exchange the access token for user profile
        c = Request.Get("https://api.amazon.com/user/profile")
                .addHeader("Authorization", "bearer " + accessToken)
                .execute()
                .returnContent();

        m = new ObjectMapper().readValue(c.toString(), Map.class);

        System.out.println(String.format("%s %s %s", m.get("name"), m.get("email"), m.get("user_id")));
    }

}
