package com.example.fragment_fragmentverigonderimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChangeFragment changeFragment = new ChangeFragment(MainActivity.this);
        changeFragment.change(new Fm1());
        changeFragment.showToFragment2(new Fm2());
    }
}
