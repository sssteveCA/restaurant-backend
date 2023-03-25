package com.onlinerestaurant.restaurant.controllers;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinerestaurant.restaurant.database.models.Dish;
import com.onlinerestaurant.restaurant.database.repositories.DishRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/dishes")
public class DishController {
    
    @Autowired
    private DishRepository dishRepository;

    /**
     * Get all dishes from database
     * @return
     */
    @GetMapping("/{meal}")
    public Iterable<Dish> getDishes(HttpServletRequest request, HttpServletResponse response, @PathVariable String meal){
        Iterable<Dish> dishes = this.dishRepository.findAll();
        return dishes;
    }

}
