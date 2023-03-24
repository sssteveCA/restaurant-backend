package com.onlinerestaurant.restaurant.database.models;

import java.util.Map;

import com.onlinerestaurant.exceptions.MalformedMapException;
import com.onlinerestaurant.restaurant.database.Model;

public class Dish extends Model {

    private byte id;

    public Dish(Map<String, Object> params) throws MalformedMapException {
        super(params);
    }

    @Override
    public String getError() {
        // TODO Auto-generated method stub
        return "";
    }

    @Override
    protected boolean validateData() {
        // TODO Auto-generated method stub
        return true;
    }
    
}
