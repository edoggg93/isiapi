package com.isi.isiapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;

import com.isi.isiapi.isimaga.HttpRequest;

public class MainActivity extends AppCompatActivity {

    public static final String apiKey = "a6b602d858ae0da189dacd297";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new HttpRequest(apiKey).getProducts(Build.SERIAL);
    }
}