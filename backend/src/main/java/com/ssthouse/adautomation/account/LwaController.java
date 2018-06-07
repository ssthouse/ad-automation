package com.ssthouse.adautomation.account;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LwaController {

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
