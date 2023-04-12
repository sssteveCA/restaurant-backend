package com.onlinerestaurant.restaurant.controllers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.onlinerestaurant.restaurant.database.models.Dish;
import com.onlinerestaurant.restaurant.database.repositories.DishRepository;
import com.onlinerestaurant.restaurant.enums.Courses;
import com.onlinerestaurant.restaurant.enums.Meals;
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
        ObjectMapper om = new ObjectMapper();
        ObjectNode on = om.createObjectNode();
        Iterable<Dish> dishes = this.dishRepository.findAll();
        Iterator<Dish> dishesIterator = dishes.iterator();
        if(dishesIterator.hasNext()){
            on.put(Constants.KEY_DONE, true);
            on.putPOJO("dishes", dishes);
            return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
        }
        on.put(Constants.KEY_DONE, false);
        on.put(Constants.KEY_MESSAGE,Constants.EMPTY_DISHES);
        return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
    }

    @GetMapping("/meals/{meal}")
    public String getDishesByMeal(@PathVariable String meal, HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException{
        ObjectMapper om = new ObjectMapper();
        ObjectNode on = om.createObjectNode();
        try{
            if(Meals.isInEnum(meal)){
                Iterable<Dish> dishes = this.dishRepository.findByMeal(meal);
                Iterator<Dish> dishesIterator = dishes.iterator();
                if(dishesIterator.hasNext()){
                    on.put(Constants.KEY_DONE, true);
                    on.put(Constants.KEY_EMPTY, false);
                    on.putPOJO("dishes", dishes);
                    return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
                }
                on.put(Constants.KEY_DONE, true);
                on.put(Constants.KEY_EMPTY, false);
                on.put(Constants.KEY_MESSAGE, Constants.EMPTY_DISHES);
                return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
            }
            response.setStatus(400);
            on.put(Constants.KEY_DONE, false);
            on.put(Constants.KEY_EMPTY,false);
            on.put(Constants.KEY_MESSAGE,Constants.ERR_DISH_TYPE_INVALID);
            return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
        }catch(Exception e){
            response.setStatus(400);
            on.put(Constants.KEY_DONE, false);
            on.put(Constants.KEY_EMPTY,false);
            on.put(Constants.KEY_MESSAGE,Constants.ERR_DISH_TYPE_INVALID);
            return om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
        }
    }

}
