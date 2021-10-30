package com.example.recyclerviewimage_pert4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter ayamAdapter;
    RecyclerView.LayoutManager layoutManager;
    String[] ayamNamelist = {"Ramebox1", "Ramebox2", "Ramebox3", "Makmur1", "Makmur2", "Makmur3"};
    String[] ayamhargalist = {"Rp 15000", "Rp 15500", "Rp 12000", "Rp 23000", "Rp 24000", "Rp 20000"};
    // Define an integer array to hold the image recourse ids
    int[] ayamimages = {R.drawable.laziza1, R.drawable.laziza2, R.drawable.laziza3, R.drawable.laziza4, R.drawable.laziza6, R.drawable.laziza5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.ayamlaziza);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        ayamAdapter = new AyamAdapter(this, ayamNamelist, ayamhargalist, ayamimages);
        recyclerView.setAdapter(ayamAdapter);
    }
}