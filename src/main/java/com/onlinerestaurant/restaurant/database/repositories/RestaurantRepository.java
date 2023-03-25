package com.onlinerestaurant.restaurant.database.repositories;

import org.springframework.data.repository.CrudRepository;

import com.onlinerestaurant.restaurant.database.models.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>{
    
}
