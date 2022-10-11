package com.example.androidfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView username, password;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);

        Bundle bundle = getIntent().getExtras();

        username.setText(bundle.getString("key1","default values"));

        password.setText(bundle.getString("key2","default value"));

    }


}