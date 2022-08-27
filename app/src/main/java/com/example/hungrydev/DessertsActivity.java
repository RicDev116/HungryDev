package com.example.hungrydev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {
                new Dish("Rice with milk",
                        "White rice with pieces of banana and a the special  home soup",999.99),
                new Dish("Ice Cream",
                        "White rice with pieces of banana and a the special  home soup",999.99),
                new Dish("Hot Cakes",
                        "White rice with pieces of banana and a the special  home soup",999.99),
                new Dish("Another",
                        "White rice with pieces of banana and a the special  home soup",999.99),
        };

        ArrayAdapter<Dish> dessertsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, desserts);

        dessertsList.setAdapter(dessertsAdapter);
    }
}