package com.onlinerestaurant.restaurant.configuration.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider {

    private JwtEncoder jwtEncoder;

    public JwtProvider(JwtEncoder jwtEncoder) {
        this.jwtEncoder = jwtEncoder;
    }

    public String createToken(Authentication authentication){
        return null;
    }
}
