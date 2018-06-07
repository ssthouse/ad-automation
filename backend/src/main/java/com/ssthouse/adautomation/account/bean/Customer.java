package com.ssthouse.adautomation.account.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Customer {

    @Id
    private String amazonUserId;

    private String username;

    private String email;

    @Override
    public String toString() {
        return "use info: " + amazonUserId + "  " + username + "  " + email;
    }
}
