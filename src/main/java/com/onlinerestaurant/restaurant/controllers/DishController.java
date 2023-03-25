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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.onlinerestaurant.restaurant.database.models.Dish;
import com.onlinerestaurant.restaurant.database.repositories.DishRepository;
import com.onlinerestaurant.restaurant.interfaces.Constants;
import com.onlinerestaurant.restaurant.response.Message;

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
     * @throws JsonProcessingException
     */
    @GetMapping("/all")
    public String getDishes(HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException{
        Iterable<Dish> dishes = this.dishRepository.findAll();
        Iterator<Dish> dishesIterator = dishes.iterator();
        if(dishesIterator.hasNext())
            return new ObjectMapper().writeValueAsString(dishes);
        Message message = new Message(true, Constants.EMPTY_DISHES);
        return new ObjectMapper().writeValueAsString(message);
    }

    @GetMapping("/{course}")
    public String getDishesByCourse(HttpServletRequest request, HttpServletResponse response, @PathVariable String course) throws JsonProcessingException{
        Iterable<Dish> dishes = this.dishRepository.findByCourse(course);
        Iterator<Dish> dishesIterator = dishes.iterator();
        if(dishesIterator.hasNext())
            return new ObjectMapper().writeValueAsString(dishes);
        Message message = new Message(true, Constants.EMPTY_DISHES);
        return new ObjectMapper().writeValueAsString(message);
    }



}
