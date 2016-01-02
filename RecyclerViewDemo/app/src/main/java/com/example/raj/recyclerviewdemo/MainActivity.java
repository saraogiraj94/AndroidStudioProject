package com.example.raj.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView ;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    String[] country_names={"India","Japan","USA","Pakistan","Bangladesh","Srilanka","Australia","Netherlands","France"};
    String[] country_capital={"NewDelhi","Tokyo","Washington","Islamabad","Dhaka","Colombo","Adeliabe","Amsterdam","Paris"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        adapter=new RecylerAdapter(country_names,country_capital);
        layoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}
