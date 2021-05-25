package com.example.myapplication;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;
import com.google.android.material.navigation.NavigationView;

public class Activity_home extends AppCompatActivity {
    NavigationView navigationView;
    Toolbar toolbar;
    DrawerLayout  drawerLayout;

    public Button helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        helper=(Button) findViewById(R.id.helper);
        helper.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent helperintent = new Intent(Activity_home.this,ambulance.class);
                startActivity(helperintent);
            }

        });

        /*---------Hooks-------*/

        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        /*--------Toolbar-----*/

        setSupportActionBar(toolbar);

        /*--------Navigation Drawer Menu--*/

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);

    }


}