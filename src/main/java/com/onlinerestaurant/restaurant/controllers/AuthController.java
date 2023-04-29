package com.onlinerestaurant.restaurant.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.onlinerestaurant.restaurant.configuration.security.AuthService;
import com.onlinerestaurant.restaurant.interfaces.Constants;

@RestController
@RequestMapping
public class AuthController {
    
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public String getLoginInfo(Authentication authentication) throws JsonProcessingException{
        ObjectMapper om = new ObjectMapper();
        ObjectNode on = om.createObjectNode();
        on.put(Constants.KEY_DONE, true);
        on.put(Constants.KEY_MESSAGE, "Loggato");
        return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
    }


}
