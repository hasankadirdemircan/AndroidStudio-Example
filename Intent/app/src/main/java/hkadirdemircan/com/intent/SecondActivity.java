package hkadirdemircan.com.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button secondSecreenButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Uygulamam basladiginda methodumu tanimliyorum.
        changeActivity();
    }

    public void changeActivity()
    {
        secondSecreenButton = findViewById(R.id.secondSecreenButton);

        //button'umuzun setOnClickListener 'ini kullaniyoruz.
        //yani butonumuza tiklandiginda.
        secondSecreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ıntent'imizi yaratirken 2 parametre istiyor.
                //Bunlardan ilki hangi activity'de isek onu yazip this anahtar kelimesi getiriyoruz.
                //Ikinci parametre ise hangi activitiy'e gececeksek o classin adini yazip class anahtar kelimesi getiriyoruz.
                //Birinci parametrete getApplicationContext() deyip de yapabiliriz. İkiside aynı şeyi ifade ediyor.
                Intent ıntent = new Intent(SecondActivity.this, MainActivity.class);

                //ve activity'i baslatiyoruz.
                startActivity(ıntent);
                //yeni activity'e gectimizde eskiyi kapatmak icin finish() methodunu kullanabiliriz.
                finish();
            }
        });
    }
}
