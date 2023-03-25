package com.onlinerestaurant.restaurant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinerestaurant.restaurant.database.models.Restaurant;
import com.onlinerestaurant.restaurant.database.repositories.RestaurantRepository;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    
    @Autowired
    private RestaurantRepository restaurantRepository;

    @GetMapping("/all")
    public Iterable<Restaurant> getRestaurants(){
        return this.restaurantRepository.findAll();
    }

}
