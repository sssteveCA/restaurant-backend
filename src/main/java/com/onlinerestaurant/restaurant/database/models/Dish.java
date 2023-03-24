package com.onlinerestaurant.restaurant.database.models;

import java.util.List;
import java.util.Map;

import com.onlinerestaurant.exceptions.MalformedMapException;
import com.onlinerestaurant.restaurant.database.Model;

public class Dish extends Model {

    private byte id;
    private byte restaurant_id;
    private String name;
    private List<String> ingredients;
    private float price;

    public Dish(Map<String, Object> params) throws MalformedMapException {
        super(params);
    }

    public byte getId() { return id; }
    public byte getRestaurant_id() { return restaurant_id; }
    public String getName() { return name; }
    public List<String> getIngredients() { return ingredients; }
    public float getPrice() { return price; }

    @Override
    public String getError() {
        // TODO Auto-generated method stub
        return this.error;
    }

    @Override
    protected boolean validateData() {
        // TODO Auto-generated method stub
        return true;
    }
    
}
