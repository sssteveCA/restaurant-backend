package com.onlinerestaurant.restaurant.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.onlinerestaurant.restaurant.database.models.User;
import com.onlinerestaurant.restaurant.database.repositories.UserRepository;
import com.onlinerestaurant.restaurant.exceptions.BadRequestException;
import com.onlinerestaurant.restaurant.interfaces.Constants;
import com.onlinerestaurant.restaurant.requests.Subscribe;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class SubscribeController {

    @Autowired
    private UserRepository userRepository;
    
    @PostMapping("/register")
    public String register(@RequestBody Subscribe subscribe, HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException{
        ObjectMapper om = new ObjectMapper();
        ObjectNode on = om.createObjectNode();
        try{
            boolean firstNameSet = (subscribe.firstName != null && !subscribe.firstName.equals(""));
            boolean lastNameSet = (subscribe.lastName != null && !subscribe.lastName.equals(""));
            boolean emailSet = (subscribe.email != null && !subscribe.email.equals(""));
            boolean passwordSet = (subscribe.password != null && !subscribe.password.equals(""));
            boolean confPasswordSet = (subscribe.confPassword != null && !subscribe.confPassword.equals(""));
            if(firstNameSet && lastNameSet && emailSet && passwordSet && confPasswordSet){
                if(subscribe.password.equals(subscribe.confPassword)){
                    Optional<User> checkUser = this.userRepository.findByEmail(subscribe.email);
                    if(checkUser.isEmpty()){
                        BCryptPasswordEncoder bpe = new BCryptPasswordEncoder();
                        String passwordHash = bpe.encode(subscribe.password);
                        User user = new User();
                        user.setFirstName(subscribe.firstName);
                        user.setLastName(subscribe.lastName);
                        user.setEmail(subscribe.email);
                        user.setPassword(passwordHash);
                        userRepository.save(user);
                        on.put(Constants.KEY_DONE, true);
                        on.put(Constants.KEY_MESSAGE, Constants.OK_REGISTRATION);
                        return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
                    }//if(checkUser.isEmpty()){
                    throw new BadRequestException(Constants.ERR_EMAIL_EXISTS);
                }//if(subscribe.password.equals(subscribe.confPassword)){
                throw new BadRequestException(Constants.ERR_PASSWORD_MISMATCH);
            }//if(firstNameSet && lastNameSet && emailSet && passwordSet && confPasswordSet){
            throw new BadRequestException(Constants.ERR_MISSING_DATA);
        }catch(BadRequestException e){
            response.setStatus(400);
            on.put(Constants.KEY_DONE, false);
            on.put(Constants.KEY_MESSAGE, e.getMessage());
            return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
        }catch(Exception e){
            response.setStatus(500);
            on.put(Constants.KEY_DONE, false);
            on.put(Constants.KEY_MESSAGE, e.getMessage());
            return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
        }
    }
}
