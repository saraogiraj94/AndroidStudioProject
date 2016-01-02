package com.example.raj.slidematerial;


import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity{
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.tool);
        toolbar.setTitle("MySlide");
        setSupportActionBar(toolbar);

        NavigationFragmentDrawer navigationFragmentDrawer = (NavigationFragmentDrawer)getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        navigationFragmentDrawer.setUp((DrawerLayout)findViewById(R.id.drawer));

    }
}
