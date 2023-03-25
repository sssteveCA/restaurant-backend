package com.onlinerestaurant.restaurant.database.repositories;

import org.springframework.data.repository.CrudRepository;

import com.onlinerestaurant.restaurant.database.models.Table;

public interface TableRepository extends CrudRepository<Table, Integer>{
    
}
