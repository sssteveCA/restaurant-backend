package com.onlinerestaurant.restaurant.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    @JsonProperty("done")
    public boolean done;

    @JsonProperty("message")
    public String message;
    
}
