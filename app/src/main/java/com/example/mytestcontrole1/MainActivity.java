package com.example.mytestcontrole1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
     TextView tc;
     EditText tt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tc=findViewById(R.id.tt);
        tt=findViewById(R.id.et);

    }
}