package com.onlinerestaurant.restaurant.database.repositories;

import org.springframework.data.repository.CrudRepository;

import com.onlinerestaurant.restaurant.database.models.Dish;

public interface DishRepository extends CrudRepository<Dish, Integer> {
    
}
