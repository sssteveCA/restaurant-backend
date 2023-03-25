package com.onlinerestaurant.restaurant.database.models;

import jakarta.persistence.Entity;

@Entity
@jakarta.persistence.Table(name = "tables")
public class Table {
    
    private Integer id;
    private byte num;
    private byte seats;

    public Integer getId() { return id; }
    public byte getNum() { return num; }
    public byte getSeats() { return seats; }
}
