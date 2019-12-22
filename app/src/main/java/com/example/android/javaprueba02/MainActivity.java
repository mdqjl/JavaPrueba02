package com.example.android.javaprueba02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Beta01 miAuto01 = new Beta01(3, "fiat");
        miAuto01.toString();

    }




  }
