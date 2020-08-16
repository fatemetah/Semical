package com.example.family1.as_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class SpActivity extends AppCompatActivity {

    private static final String LOGIN = "login";
    boolean isLogin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);

        getData();

        if (isLogin) {


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SpActivity.this, Page1.class);
                    startActivity(intent);
                    finish();

                }
            }, 2000);
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SpActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();

                }
            }, 2000);
        }

    }

    private void getData() {
        SharedPreferences sharedPreferences = getSharedPreferences(LOGIN, MODE_PRIVATE);
        isLogin = sharedPreferences.getBoolean("ISLOGIN", false);


    }


}