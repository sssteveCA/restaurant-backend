package com.onlinerestaurant.restaurant.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscribeController {
    
    @PostMapping("/register")
    public String register(){
        return "";
    }
}
