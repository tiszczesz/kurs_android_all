package com.example.my9application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private  RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Fajny obrazek","Druga linia dla obrazka"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_add_photo,"Fajny inny obrazek","Druga linia dla obrazka"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_airplanemode,"Ala ma kota","Druga linia dla obrazka"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Fajny obrazek","Druga linia dla obrazka"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_airplanemode,"Fajny obrazek","Druga linia dla obrazka"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Fajny obrazek","Druga linia dla obrazka"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_airplanemode,"Fajny obrazek","Druga linia dla obrazka"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_add_photo,"Fajny obrazek","Druga linia dla obrazka"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_add_photo,"Fajny obrazek","Druga linia dla obrazka"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_airplanemode,"Fajny obrazek","Druga linia dla obrazka"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_add_photo,"Fajny obrazek","Druga linia dla obrazka"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_airplanemode,"Fajny obrazek","Druga linia dla obrazka"));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}