package com.onlinerestaurant.restaurant.models;

import java.util.List;
import java.util.Map;

public class Dish {

    private byte restaurant_id;
    private String name;
    private List<String> ingredients;
    private float price;

    public Dish(Map<String, Object> params){
        
    }

    public byte getRestaurant_id() { return restaurant_id; }
    public void setRestaurant_id(byte restaurant_id) { this.restaurant_id = restaurant_id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<String> getIngredients() { return ingredients; }
    public void setIngredients(List<String> ingredients) { this.ingredients = ingredients; }
    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }
    
}
