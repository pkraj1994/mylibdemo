package com.tpcodl.samplehimu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tpcodl.mylibdemo.MyLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLibrary.openWebView(MainActivity.this);
    }
}