package com.onlinerestaurant.restaurant.controllers;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.onlinerestaurant.exceptions.MalformedMapException;
import com.onlinerestaurant.restaurant.interfaces.Constants;
import com.onlinerestaurant.restaurant.models.Dish;

@RestController
@RequestMapping("/menu")
public class MenuController {
    
    @GetMapping("/first")
    public String menuFirst(){
        String response = "";
        Map<String, Object> params = Stream.of(new Object[][]{
            {"restaurant_id", (byte)1},
            {"name", "Don Gennaro"},
            {"ingredients", Arrays.asList("pomodoro","mozzarella","pane")},
            {"price", 25.60f}
        }).collect(Collectors.toMap(data -> (String)data[0], data -> (Object) data[1]));
        try {
            Dish dish = new Dish(params);
            response = new ObjectMapper().writeValueAsString(dish);
        } catch (MalformedMapException e) {
            // TODO Auto-generated catch block
            response = Constants.ERR_MENU;
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            response = Constants.ERR_MENU;
            e.printStackTrace();
        }
        return response;
    }
}
