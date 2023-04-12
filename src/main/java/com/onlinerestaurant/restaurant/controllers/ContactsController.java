package com.onlinerestaurant.restaurant.controllers;

import java.util.AbstractMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.onlinerestaurant.restaurant.exceptions.BadRequestException;
import com.onlinerestaurant.restaurant.exceptions.MalformedMapException;
import com.onlinerestaurant.restaurant.interfaces.Constants;
import com.onlinerestaurant.restaurant.mails.TextMail;
import com.onlinerestaurant.restaurant.requests.Contacts;
import com.onlinerestaurant.restaurant.response.Message;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/contacts")
public class ContactsController {
    
    @PostMapping("/support")
    public String support(@RequestBody Contacts contacts, HttpServletResponse response) throws JsonProcessingException{
        ObjectMapper om = new ObjectMapper();
        ObjectNode on = om.createObjectNode();
        try {
            boolean nameSet = (contacts.name != null && !contacts.name.equals(""));
            boolean emailSet = (contacts.email != null && !contacts.email.equals(""));
            boolean messageSet = (contacts.message != null && !contacts.message.equals(""));
            if(nameSet && emailSet && messageSet){
                Map<String, String> data = Map.ofEntries(
                    new AbstractMap.SimpleImmutableEntry<>("from","admin@onlinerestaurant.com"),
                    new AbstractMap.SimpleImmutableEntry<>("to",contacts.email),
                    new AbstractMap.SimpleImmutableEntry<>("subject","Richiesta informazioni"),
                    new AbstractMap.SimpleImmutableEntry<>("text",contacts.message)
                );
                TextMail tm = new TextMail(data);
                on.put(Constants.KEY_DONE,true);
                on.put(Constants.KEY_MESSAGE,Constants.OK_SUPPORT);
                return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
            }
            throw new BadRequestException(Constants.ERR_MISSING_DATA);
        } catch (BadRequestException|MalformedMapException e){
            response.setStatus(400);
            on.put(Constants.KEY_DONE,false);
            on.put(Constants.KEY_MESSAGE,Constants.ERR_MISSING_DATA);
            return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
        } catch (Exception e){
            response.setStatus(500);
            on.put(Constants.KEY_DONE,false);
            on.put(Constants.KEY_MESSAGE,Constants.ERR_REQUEST);
            return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
        }
    }
}
