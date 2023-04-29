package com.onlinerestaurant.restaurant.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.onlinerestaurant.restaurant.configuration.security.AuthService;

@RestController
public class AuthController {
    
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }


}
