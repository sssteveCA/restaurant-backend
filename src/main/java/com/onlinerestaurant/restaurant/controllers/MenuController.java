package com.onlinerestaurant.restaurant.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {
    
    @GetMapping("/first")
    public String menuFirst(){
        return "";
    }
}
