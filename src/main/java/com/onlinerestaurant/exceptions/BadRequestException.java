package com.onlinerestaurant.exceptions;

/**
 * Thrown when the response returns a 400 status code
 */
public class BadRequestException extends RuntimeException{

    public BadRequestException(String arg0) {
        super(arg0);
    }


}
