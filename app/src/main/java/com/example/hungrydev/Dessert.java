package com.example.hungrydev;

public class Dessert {

    String title;
    String description;
    double price;

    Dessert(String title,String description,double price){
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return title;
    }
}
