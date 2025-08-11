package br.com.alpha.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequester {
    private String userId;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}