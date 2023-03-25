package com.onlinerestaurant.restaurant.general;

public class EnumManager<E extends Enum<E>,T>{

    private E myEnum;
    private T myValue;

    public EnumManager(E myEnum, T myValue){
        this.myEnum = myEnum;
        this.myValue = myValue;
    }
    
}
