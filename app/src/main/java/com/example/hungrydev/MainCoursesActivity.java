package com.example.hungrydev;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);
        Dish[] mainCourses = {
                new Dish("Huevo con jamón","Un rico huevito con jamon, especias y jamón",50.00),
                new Dish("Huevo con chorizo","Un rico huevito con jamon, especias y chorizo",55.00),
                new Dish("Huevo con salchicha","Un rico huevito con jamon, especias y salchicha",60.00),
                new Dish("Huevo con Hot cakes","Un rico huevito con jamon, especias y Hot cakes",70.00),
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mainCourses);
        mainCoursesList.setAdapter(dishesAdapter);
    }
}


