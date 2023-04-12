package com.onlinerestaurant.restaurant.database.repositories;

import org.springframework.data.repository.CrudRepository;

import com.onlinerestaurant.restaurant.database.models.User;

public interface UserRepository extends CrudRepository<User,Long> {
    
}
