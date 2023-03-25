package com.onlinerestaurant.restaurant.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.onlinerestaurant.requests.Contacts;

@RestController
@RequestMapping("/contacts")
public class ContactsController {
    
    @PostMapping("/support")
    public String support(@RequestBody Contacts contacts){
        String response = "";
        try {
            response = new ObjectMapper().writeValueAsString(contacts);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            response = e.getMessage();
        } catch(Exception e){
            response = e.getMessage();
        }
        return response;
    }
}
