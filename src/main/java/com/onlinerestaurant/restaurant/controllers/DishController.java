package com.onlinerestaurant.restaurant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlinerestaurant.restaurant.database.repositories.DishRepository;

@Controller
@RequestMapping("/dish")
public class DishController {
    
    @Autowired
    private DishRepository dishRepository;

    

}
