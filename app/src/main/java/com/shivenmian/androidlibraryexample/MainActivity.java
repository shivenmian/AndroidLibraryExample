package com.shivenmian.androidlibraryexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shivenmian.awesomelibrary.AwesomeLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AwesomeLibrary.getInstance().makeMeAwesome(this, "Shiven");

    }
}
