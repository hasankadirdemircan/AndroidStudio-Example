package com.example.activityicerisindefragmentdegistirme_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChangeFragment changeFragment = new ChangeFragment(MainActivity.this);
        //bundle null ise ilk claisacak fragment'i tanimlayacagiz.
        // hic fragment yoksa,
        //veya ilk calismasi istedigimiz fragment
        //bkz. Login islemi
        changeFragment.change(new Fragment1());//ilk fragment atadik.

    }
}
