package com.example.firstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
//Using the tutorial from https://developer.android.com/training/basics/firstapp/creating-project
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
