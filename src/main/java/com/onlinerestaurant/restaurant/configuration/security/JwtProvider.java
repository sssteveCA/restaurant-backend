package com.onlinerestaurant.restaurant.configuration.security;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider {

    public String createToken(Authentication authentication){
        return null;
    }
}
