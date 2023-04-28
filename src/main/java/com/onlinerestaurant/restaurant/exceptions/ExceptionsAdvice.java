package com.onlinerestaurant.restaurant.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.onlinerestaurant.restaurant.interfaces.Constants;

@RestControllerAdvice
public class ExceptionsAdvice{

    @ExceptionHandler({UsernameNotFoundException.class, BadCredentialsException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String handleAuthenticationException(Exception ex) throws JsonProcessingException{
        ObjectMapper om = new ObjectMapper();
        ObjectNode on = om.createObjectNode();
        on.put(Constants.KEY_DONE, false);
        on.put(Constants.KEY_MESSAGE, Constants.ERR_WRONG_CREDENTIALS);
        return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
    }


}