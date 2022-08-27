package com.example.hungrydev;

public class Dish {

    String title;
    String description;
    double price;

    Dish(String title,String description,double price){
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return title;
    }
}
