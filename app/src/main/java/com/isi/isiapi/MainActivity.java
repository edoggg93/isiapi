package com.isi.isiapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.isi.isiapi.general.classes.Department;
import com.isi.isiapi.general.classes.ElementBill;
import com.isi.isiapi.general.classes.NotesOrderGuest;
import com.isi.isiapi.general.classes.Operator;
import com.isi.isiapi.general.classes.OrderGuest;
import com.isi.isiapi.general.classes.OrderGuestElement;
import com.isi.isiapi.general.classes.Report;
import com.isi.isiapi.isiorder.HttpRequest;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String apiKey = "a6b602d858ae0da189dacd297";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}