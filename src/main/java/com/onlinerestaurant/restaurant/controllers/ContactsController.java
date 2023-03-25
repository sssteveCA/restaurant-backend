package com.onlinerestaurant.restaurant.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.onlinerestaurant.exceptions.BadRequestException;
import com.onlinerestaurant.requests.Contacts;
import com.onlinerestaurant.restaurant.interfaces.Constants;

@RestController
@RequestMapping("/contacts")
public class ContactsController {
    
    @PostMapping("/support")
    public String support(@RequestBody Contacts contacts){
        try {
            boolean nameSet = (contacts.name != null && !contacts.name.equals(""));
            boolean emailSet = (contacts.email != null && !contacts.email.equals(""));
            boolean messageSet = (contacts.message != null && !contacts.message.equals(""));
            if(nameSet && emailSet && messageSet){
                return new ObjectMapper().writeValueAsString(contacts);
            }
            throw new BadRequestException(Constants.ERR_MISSING_DATA);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
