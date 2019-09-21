package com.example.fragmentactivityverigonderme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        ChangeFragment changeFragment = new ChangeFragment(MainActivity.this);
        changeFragment.change(new Fm1());
        /*
        Bundle bundle = getIntent().getExtras(); //veriyi boylede alabiliriz.
        String msg = bundle.getString("msg");
        textView.setText(msg);
        */

        if(getIntent().getExtras() != null){
            String msg = getIntent().getExtras().getString("msg").toString();
            textView.setText(msg);
        }


    }
}
