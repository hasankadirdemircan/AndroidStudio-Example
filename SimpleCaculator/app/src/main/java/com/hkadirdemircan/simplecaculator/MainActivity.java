package com.hkadirdemircan.simplecaculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView textView;
    int sayi1;
    int sayi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.resultText);
    }

    public void readText(){

        sayi1 = Integer.parseInt(editText1.getText().toString());
        sayi2 = Integer.parseInt(editText2.getText().toString());
    }
    public void sum(View view) {
        readText();
        int resultInt = sayi1 + sayi2;
        textView.setText("Result : " + resultInt);
    }

    public void deduct(View view) {
        readText();
        int resultInt = sayi1 - sayi2;
        textView.setText("Result : " + resultInt);
    }

    public void multiply (View view) {
        readText();
        int resultInt = sayi1 * sayi2;
        textView.setText("Result : " + resultInt);
    }

    public void divide (View view) {
        readText();
        int resultInt = sayi1 / sayi2;
        textView.setText("Result : " + resultInt);
    }

}
