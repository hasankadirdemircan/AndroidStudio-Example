package com.hkadirdemircan.myfirsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeImage(View view ){

        ImageView imageView = findViewById(R.id.javaIcon);
        imageView.setImageResource(R.drawable.android);

    }
}
