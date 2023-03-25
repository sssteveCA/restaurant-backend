package com.onlinerestaurant.restaurant.database.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 60, nullable = false)
    private String name;

    @Column(length = 60, nullable = false)
    private String state;

    @Column(length = 60, nullable = false)
    private String region;

    @Column(length = 60, nullable = false)
    private String province;

    @Column(length = 60, nullable = false)
    private String city;

    @Column(length = 100, nullable = false)
    private String address;

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER)
    private Set<Dish> dishes;
    
    public String getName() {return name;}
    public String getState() {return state;}
    public String getRegion() {return region;}
    public String getProvince() {return province;}
    public String getCity() {return city;}
    public String getAddress() {return address;}
}
