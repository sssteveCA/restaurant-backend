package com.onlinerestaurant.restaurant.database.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.onlinerestaurant.restaurant.database.models.User;

public interface UserRepository extends CrudRepository<User,Long> {
    
    public Optional<User> findByEmail(String email);
}
