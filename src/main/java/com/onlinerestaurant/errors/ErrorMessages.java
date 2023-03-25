package com.onlinerestaurant.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onlinerestaurant.exceptions.BadRequestException;

/**
 * This class handles the server response error messages  
 */
@RestControllerAdvice
public class ErrorMessages {
    
    /**
     * HTTP 400 response code error message
     * @param e an instance of BadRequestException
     * @return the error message
     */
    //@ResponseBody
    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String badRequest(BadRequestException e){
        return "Ciao";
    }
}
