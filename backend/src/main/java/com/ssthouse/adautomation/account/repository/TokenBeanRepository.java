package com.ssthouse.adautomation.account.repository;

import com.ssthouse.adautomation.account.bean.TokenBean;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TokenBeanRepository extends MongoRepository<TokenBean, String> {

    TokenBean findByAmazonUserId(String amazonUserId);
}
