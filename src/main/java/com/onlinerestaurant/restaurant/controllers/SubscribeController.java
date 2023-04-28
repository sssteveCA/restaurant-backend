package com.onlinerestaurant.restaurant.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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
import com.onlinerestaurant.restaurant.services.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class SubscribeController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @PostMapping("/register")
    public String register(@RequestBody Subscribe subscribe, HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException{
        ObjectMapper om = new ObjectMapper();
        ObjectNode on = om.createObjectNode();
        try{
            boolean valid = this.validateRegistrationData(subscribe);
            if(valid){
                if(subscribe.password.equals(subscribe.confPassword)){
                    Optional<User> checkUser = this.userRepository.findByEmail(subscribe.email);
                    if(checkUser.isEmpty()){
                        UserService userService = new UserService(this.userRepository, this.passwordEncoder);
                        userService.save(subscribe.firstName, subscribe.lastName,subscribe.email,subscribe.password);
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

    /**
     * Check if registration values are valid
     * @param subscribe
     * @return
     */
    private boolean validateRegistrationData(Subscribe subscribe){
        if(subscribe.firstName == null || subscribe.firstName.equals(""))return false;
        if(subscribe.lastName == null || subscribe.lastName.equals(""))return false;
        if(subscribe.email == null || subscribe.email.equals(""))return false;
        if(subscribe.password == null || subscribe.password.equals(""))return false;
        if(subscribe.confPassword == null || subscribe.confPassword.equals(""))return false;
        return true;
    }
}
