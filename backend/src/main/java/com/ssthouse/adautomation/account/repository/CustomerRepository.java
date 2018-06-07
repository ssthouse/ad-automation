package com.ssthouse.adautomation.account.repository;

import com.ssthouse.adautomation.account.bean.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByEmail(String email);
}
