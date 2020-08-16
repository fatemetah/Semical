package com.example.family1.as_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;

    EditText name;
    Button start;
    boolean isLogin = false;
    String name_txt;
    private static final String LOGIN = "login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setupView();

    }

    private void setupView() {

        name = (EditText) findViewById(R.id.name_ed);
        start = (Button) findViewById(R.id.start);
        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int viewID = v.getId();
        switch (viewID) {
            case R.id.start:
                nameValidation();
                break;
        }

    }

    private void nameValidation() {
        name_txt = name.getText().toString().trim();
        if (name_txt.isEmpty()) {
            Toast.makeText(this, "*Enter your name ", Toast.LENGTH_SHORT).show();
        } else {
            saveName();
        }

    }


    private void saveName() {

        isLogin = !isLogin;
        SharedPreferences sharedPreferences = getSharedPreferences(LOGIN, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("NAME", name_txt);
        editor.putBoolean("ISLOGIN", isLogin);
        editor.apply();

        goToHome();

    }

    private void goToHome() {

        Intent intent = new Intent(LoginActivity.this, Page1.class);
        startActivity(intent);
        finish();

    }


}
