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

    public static boolean isInEnum(String value){
        for(Courses course : values()){
            if(course.toString().equalsIgnoreCase(value))
                return true;
        }
        return false;
    }
}
