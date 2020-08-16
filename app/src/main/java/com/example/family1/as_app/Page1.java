package com.example.family1.as_app;

import android.app.DatePickerDialog;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

public class Page1 extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        setupViewe();
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    private void setupViewe() {
        frameLayout = (FrameLayout) findViewById(R.id.frme);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.frme, new homeFm()).commit();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int navID = menuItem.getItemId();
        switch (navID) {
            case R.id.clock_24:
                getSupportFragmentManager().beginTransaction().replace(R.id.frme, new homeFm()).commit();
                break;

            case R.id.stats:
                getSupportFragmentManager().beginTransaction().replace(R.id.frme, new statsFm()).commit();
                break;


            case R.id.setting:
                getSupportFragmentManager().beginTransaction().replace(R.id.frme, new settingFm()).commit();

                break;

        }


        return true;

    }
}
