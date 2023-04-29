package com.onlinerestaurant.restaurant.controllers;

import java.util.Map;

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
        Map<String, Object> loginMap = this.authService.createLoginInfo(authentication);
        String serializedMap = om.writerWithDefaultPrettyPrinter().writeValueAsString(loginMap);
        on.put(Constants.KEY_DONE, true);
        on.put(Constants.KEY_MESSAGE, "Loggato");
        on.put("data",serializedMap);
        return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
    }


}
