package com.onlinerestaurant.restaurant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onlinerestaurant.restaurant.database.models.Dish;
import com.onlinerestaurant.restaurant.database.repositories.DishRepository;

@Controller
@RequestMapping("/dish")
public class DishController {
    
    @Autowired
    private DishRepository dishRepository;

    /**
     * Get all dishes from database
     * @return
     */
    @PostMapping("/all")
    @ResponseBody
    public Iterable<Dish> getDishes(){
        return this.dishRepository.findAll();
    }

}
