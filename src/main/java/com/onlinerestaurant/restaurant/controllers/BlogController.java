package com.onlinerestaurant.restaurant.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.onlinerestaurant.restaurant.interfaces.Constants;

@RestController
@RequestMapping("/articles")
public class BlogController {

    @GetMapping("")
    public String articles() throws JsonProcessingException{
        ObjectMapper om = new ObjectMapper();
        ObjectNode on = om.createObjectNode();
        on.put(Constants.KEY_DONE, true);
        on.put(Constants.KEY_EMPTY, true);
        on.put(Constants.KEY_MESSAGE, Constants.EMPTY_ARTICLES);
        return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
    }
    
}
