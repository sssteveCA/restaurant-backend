package com.onlinerestaurant.restaurant.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    @JsonProperty("done")
    public boolean done;

    @JsonProperty("message")
    public String message;

    public Message(boolean done, String message){
        this.done = done;
        this.message = message;
    }
    
}
