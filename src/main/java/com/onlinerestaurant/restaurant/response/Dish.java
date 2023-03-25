package com.onlinerestaurant.restaurant.response;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onlinerestaurant.restaurant.exceptions.MalformedMapException;

public class Dish {

    @JsonProperty("restaurant_id")
    public byte restaurant_id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("ingredients")
    public List<String> ingredients;

    @JsonProperty("price")
    public float price;

    public Dish(){}

    public Dish(Map<String, Object> params) throws MalformedMapException{
        this.setValues(params);
    }

    private void setValues(Map<String, Object> params) throws MalformedMapException{
        if(params.containsKey("restaurant_id") && params.containsKey("name") && params.containsKey("ingredients") && params.containsKey("price")){
            this.restaurant_id = (byte) params.get("restaurant_id");
            this.name = (String) params.get("name");
            this.ingredients = (List<String>) params.get("ingredients");
            this.price = (float) params.get("price");
        }
        else throw new MalformedMapException();
    }
    
}
