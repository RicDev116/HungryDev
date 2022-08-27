package com.example.hungrydev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        Dish[] dishes = {
                new Dish("Rice and trout soup",
                        "White rice with pieces of banana and a the special  home soup",999.99),
                new Dish("Rice and trout soup",
                        "White rice with pieces of banana and a the special  home soup",999.99),
                new Dish("Rice and trout soup",
                        "White rice with pieces of banana and a the special  home soup",999.99),
                new Dish("Rice and trout soup",
                        "White rice with pieces of banana and a the special  home soup",999.99),
        };

        String[] dishesArrayString = {
                "Rice and trout soup",
                "Strawberry and duck crepes",
                "Rice and trout soup",
                "Strawberry and duck crepes",
                "Rice and trout soup",
                "Strawberry and duck crepes",
                "Rice and trout soup",
                "Strawberry and duck crepes",
                "Rice and trout soup",
                "Strawberry and duck crepes",
                "Rice and trout soup",
                "Strawberry and duck crepes",
                "Rice and trout soup",
                "Strawberry and duck crepes",
                "Rice and trout soup",
                "Strawberry and duck crepes",
                "Rice and trout soup",
                "Strawberry and duck crepes",
                "Rice and trout soup",
                "Strawberry and duck crepes",
        };
        //ArrayAdapter<String> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, dishes);

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, dishes);
        startersList.setAdapter(dishesAdapter);

    }
}