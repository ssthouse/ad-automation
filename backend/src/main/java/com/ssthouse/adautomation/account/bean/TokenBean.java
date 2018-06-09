package com.ssthouse.adautomation.account.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenBean {

    @Id
    private String amazonUserId;

    private String authToken;

    private String accessToken;
    private String refreshToken;
}
