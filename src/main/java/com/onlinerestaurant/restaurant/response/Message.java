package com.onlinerestaurant.restaurant.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    @JsonProperty("done")
    public boolean done;

    @JsonProperty("empty")
    public boolean empty;

    @JsonProperty("message")
    public String message;

    public Message(boolean done, boolean empty, String message){
        this.done = done;
        this.empty = empty;
        this.message = message;
    }
    
}
