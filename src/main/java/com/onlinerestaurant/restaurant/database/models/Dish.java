package com.onlinerestaurant.restaurant.database.models;

import java.util.List;
import java.util.Map;

import com.onlinerestaurant.restaurant.database.Model;
import com.onlinerestaurant.restaurant.exceptions.MalformedMapException;
import com.onlinerestaurant.restaurant.interfaces.Constants;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dish {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private byte id;
    private byte restaurant_id;
    private String name;
    private List<String> ingredients;
    private float price;

    public byte getId() { return id; }
    public byte getRestaurant_id() { return restaurant_id; }
    public String getName() { return name; }
    public List<String> getIngredients() { return ingredients; }
    public float getPrice() { return price; }

  

}
