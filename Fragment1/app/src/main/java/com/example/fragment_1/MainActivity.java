package com.example.fragment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activity'lere gore cok hizli bir yapidir.
        //1 class, 1 layout olusur.

        Button button = findViewById(R.id.fragment1);

    }
}
