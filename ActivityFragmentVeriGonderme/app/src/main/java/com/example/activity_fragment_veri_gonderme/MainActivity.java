package com.example.activity_fragment_veri_gonderme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);


        //Activity icerisinde fragment gosterme islemi.
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, new Fm1(), "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fragment'e veri gonderim -> set argument
                ChangeFragment changeFragment = new ChangeFragment(MainActivity.this);
                changeFragment.change(new Fm1(),editText.getText().toString());
            }
        });
    }
}
