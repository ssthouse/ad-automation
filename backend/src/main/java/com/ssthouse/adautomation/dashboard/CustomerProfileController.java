package com.ssthouse.adautomation.dashboard;

import com.ssthouse.adautomation.account.bean.Customer;
import com.ssthouse.adautomation.account.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
@Slf4j
public class CustomerProfileController {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerProfileController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @RequestMapping(value = "/customerInfo/{amazonUserId}", method = RequestMethod.GET)
    public Customer customerInfo(HttpServletRequest request, @PathVariable String amazonUserId) {
        //verify token
        log.info("in customer info");
        return customerRepository.findById(amazonUserId).orElse(null);
    }
}
