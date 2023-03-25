package com.onlinerestaurant.restaurant.enums;

public enum Courses{
    APPETIZER("Antipasto"),
    FIRST("Primo"),
    SECOND("Secondo"),
    SIDEDISH("Contorno"),
    DESSERT("Dolce");

    private String course;

    Courses(String course){
        this.course = course;
    }

    @Override
    public String toString(){return this.course;}
}
