package com.example.leson3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        ArrayList<String> animals = new ArrayList<>();
        animals.add("cats");
        animals.add("cats");
        animals.add("cats");
        animals.add("cats");
        animals.add("cats");
        animals.add("cats");
        animals.add("cats");
        animals.add("cats");
        AnimalAdapter adapter = new AnimalAdapter(animals);
        recyclerView.setAdapter(adapter);
    }
}