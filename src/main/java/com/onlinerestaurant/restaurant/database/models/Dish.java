package com.onlinerestaurant.restaurant.database.models;

import java.util.List;
import java.util.Map;

import com.onlinerestaurant.restaurant.database.Model;
import com.onlinerestaurant.restaurant.enums.Courses;
import com.onlinerestaurant.restaurant.enums.Meals;
import com.onlinerestaurant.restaurant.exceptions.MalformedMapException;
import com.onlinerestaurant.restaurant.interfaces.Constants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "dishes")
public class Dish {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 60, nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "JSON default \"[]\"")
    private String ingredients;

    @Column(nullable = false, columnDefinition = "ENUM('Antipasto','Primo','Secondo','Controrno','Dolce','Altro') default 'Altro'")
    private String course;
    
    @Column(nullable = false, columnDefinition = "ENUM('Pranzo','Cena') default 'Cena'")
    private String meal;

    @Column(nullable = false)
    private float price;

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getIngredients() { return ingredients; }
    public String getCourse(){ return this.course; }
    public String getMeal(){ return this.meal; }
    public float getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }
    public void setCourse(String course) { this.course = course; }
    public void setMeal(String meal) { this.meal = meal; }
    public void setPrice(float price) { this.price = price; }

}
