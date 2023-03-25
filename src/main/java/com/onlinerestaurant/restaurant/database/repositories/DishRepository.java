package com.onlinerestaurant.restaurant.database.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlinerestaurant.restaurant.database.models.Dish;

@Repository
public interface DishRepository extends CrudRepository<Dish, Integer> {
    
}
