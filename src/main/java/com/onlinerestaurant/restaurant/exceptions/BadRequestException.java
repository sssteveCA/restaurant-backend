package com.onlinerestaurant.restaurant.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Thrown when the response returns a 400 status code
 */
public class BadRequestException extends RuntimeException{

    public BadRequestException(String arg0) {
        super(arg0);
    }


}
