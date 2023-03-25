package com.onlinerestaurant.restaurant.database.models;

import java.util.List;
import java.util.Map;

import com.onlinerestaurant.restaurant.database.Model;
import com.onlinerestaurant.restaurant.exceptions.MalformedMapException;
import com.onlinerestaurant.restaurant.interfaces.Constants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "dishes")
public class Dish {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 60, nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "JSON default []")
    private List<String> ingredients;

    @Column(nullable = false)
    private float price;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    public Integer getId() { return id; }
    public String getName() { return name; }
    public List<String> getIngredients() { return ingredients; }
    public float getPrice() { return price; }
    public Restaurant getRestaurant() { return restaurant; }

  

}
