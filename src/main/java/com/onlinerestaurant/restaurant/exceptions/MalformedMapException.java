package com.onlinerestaurant.restaurant.exceptions;

/**
 * Thrown when a Map doesn't contain all the required values
 */
public class MalformedMapException extends Exception {

    public MalformedMapException(){
        super();
    }

    public MalformedMapException(String message){
        super(message);
    }
    
}
