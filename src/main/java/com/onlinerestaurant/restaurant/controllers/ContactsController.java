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
import com.onlinerestaurant.restaurant.response.Message;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/contacts")
public class ContactsController {
    
    @PostMapping("/support")
    public String support(@RequestBody Contacts contacts, HttpServletResponse response) throws JsonProcessingException{
        try {
            boolean nameSet = (contacts.name != null && !contacts.name.equals(""));
            boolean emailSet = (contacts.email != null && !contacts.email.equals(""));
            boolean messageSet = (contacts.message != null && !contacts.message.equals(""));
            if(nameSet && emailSet && messageSet){
                Message message = new Message(true, Constants.OK_SUPPORT);
                return new ObjectMapper().writeValueAsString(message);
            }
            throw new BadRequestException(Constants.ERR_MISSING_DATA);
        } catch (BadRequestException e){
            response.setStatus(400);
            Message message = new Message(false, e.getMessage());
            return new ObjectMapper().writeValueAsString(message);
        }
    }
}
