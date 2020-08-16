package com.example.family1.as_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class General extends AppCompatActivity {

    private Button habit;
    private Button weekends;
    private Button password;
    private Button getfree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        habit = (Button) findViewById(R.id.Habit);
        habit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHabit();
            }
        });

        weekends = (Button) findViewById(R.id.Weekends);
        weekends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeekends();
            }
        });

        password = (Button) findViewById(R.id.Password);
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPassword();
            }
        });

        getfree = (Button) findViewById(R.id.Getfree);
        getfree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGetfree();
            }
        });


    }

    public void openHabit() {
        Intent intent = new Intent(this, Habit.class);
        startActivity(intent);
    }

    public void openWeekends() {
        Intent intent = new Intent(this, Weekends.class);
        startActivity(intent);
    }

    public void openPassword() {
        Intent intent = new Intent(this, Password.class);
        startActivity(intent);
    }

    public void openGetfree() {
        Intent intent = new Intent(this, Getfree.class);
        startActivity(intent);
    }


}
