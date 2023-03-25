package com.onlinerestaurant.restaurant.database.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@jakarta.persistence.Table(name = "tables")
public class Table {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TINYINT UNSIGNED")
    private byte num;

    @Column(columnDefinition = "TINYINT UNSIGNED")
    private byte seats;

    public Integer getId() { return id; }
    public byte getNum() { return num; }
    public byte getSeats() { return seats; }
}
