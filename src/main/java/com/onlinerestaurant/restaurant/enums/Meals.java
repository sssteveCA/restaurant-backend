package com.onlinerestaurant.restaurant.enums;

public enum Meals{
    LUNCH("Pranzo"),
    DINNER("Cena");

    private String meal;

    Meals(String meal){
        this.meal = meal;
    }

    @Override
    public String toString(){ return this.meal; }
}
