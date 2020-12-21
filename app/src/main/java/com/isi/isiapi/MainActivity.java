package com.isi.isiapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.isi.isiapi.general.classes.Department;
import com.isi.isiapi.general.classes.Operator;
import com.isi.isiapi.general.classes.OrderGuest;
import com.isi.isiapi.general.classes.Report;
import com.isi.isiapi.isicashier.HttpRequest;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}