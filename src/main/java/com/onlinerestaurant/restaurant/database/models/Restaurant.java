package com.onlinerestaurant.restaurant.database.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private byte id;
    private String name;
    private String state;
    private String region;
    private String province;
    private String city;
    private String address;
    
    public String getName() {return name;}
    public String getState() {return state;}
    public String getRegion() {return region;}
    public String getProvince() {return province;}
    public String getCity() {return city;}
    public String getAddress() {return address;}
}
