package hkadirdemircan.com.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    /**
     * Intent Nedir ?
     * Uygulamamizda bir ekrandan(activity) başka activity'e gecmek icin kullanilan bir yapidir.
     * Ornegin Uye Giris Ekranı olsun Giris Buton'una bastigimizda yeni bir ekrana gecmesi olayı.
     */
    Button firstSecreenButton; //layout'da koydugumuz button id'si
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Uygulamam basladiginda methodumu tanimliyorum.
        changeActivity();
    }

    public void changeActivity()
    {
        firstSecreenButton = findViewById(R.id.firstSecreenButton); // button id'mizi aldik.

        //button'umuzun setOnClickListener 'ini kullaniyoruz.
        //yani butonumuza tiklandiginda.
        firstSecreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ıntent'imizi yaratirken 2 parametre istiyor.
                //Bunlardan ilki hangi activity'de isek onu yazip this anahtar kelimesi getiriyoruz.
                //Ikinci parametre ise hangi activitiy'e gececeksek o classin adini yazip class anahtar kelimesi getiriyoruz.
                Intent ıntent = new Intent(MainActivity.this,SecondActivity.class);
                //ve activity'i baslatiyoruz.
                startActivity(ıntent);
                //eger birden fazla activity varsa arka planda birikir.
                //yeni activity'e gectimizde eskiyi kapatmak icin finish() methodunu kullanabiliriz.
                finish();
            }
        });
    }
}
