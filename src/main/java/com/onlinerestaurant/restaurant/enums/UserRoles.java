package com.onlinerestaurant.restaurant.enums;

public enum UserRoles {
    ADMIN("admin"),
    USER("user");

    private String role;

    @Override
    public String toString(){return this.role;}

    UserRoles(String role){
        this.role = role;
    }
}
