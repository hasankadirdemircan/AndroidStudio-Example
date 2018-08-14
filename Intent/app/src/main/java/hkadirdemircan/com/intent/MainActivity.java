package hkadirdemircan.com.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    /**
     * Intent Nedir ?
     * Uygulamamizda bir ekrandan(activity) başka activity'e gecmek icin kullanilan bir yapidir.
     * Ornegin Uye Giris Ekranı olsun Giris Buton'una bastigimizda yeni bir ekrana gecmesi olayı.
     * Ayrica intent'ler ile bir sonraki activity'e bilgi tasiyabiliriz.
     * Mesela kullanici adi ile giris yaptiginda hosgeldin Hasan gibi textView'e
     * girdigi bilgiyi alip bir sonraki activity'de kullanabiliriz.
     */
    Button firstSecreenButton;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Uygulamam basladiginda methodumu tanimliyorum.
        changeActivity();
    }

    public void changeActivity()
    {
        // button id'mizi aldik. degiskene attik.
        //genelde layout'ta verdigimiz id ile degisken adi ayni koyariz ki
        //bir karisiklik cikmasin.
        firstSecreenButton = (Button) findViewById(R.id.firstSecreenButton);
        editText = (EditText) findViewById(R.id.editText);
        //button'umuzun setOnClickListener 'ini kullaniyoruz.
        //yani butonumuza tiklandiginda.
        firstSecreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ıntent'imizi yaratirken 2 parametre istiyor.
                //Bunlardan ilki hangi activity'de isek onu yazip this anahtar kelimesi getiriyoruz.
                //Ikinci parametre ise hangi activitiy'e gececeksek o classin adini yazip class anahtar kelimesi getiriyoruz.
                Intent ıntent = new Intent(MainActivity.this,SecondActivity.class);
                /*
                put extra ile activity arasi bilgiler gonderebiliriz.
                 */
                ıntent.putExtra("input",editText.getText().toString());
                //ve activity'i baslatiyoruz.
                startActivity(ıntent);
                //eger birden fazla activity varsa arka planda birikir.
                //yeni activity'e gectimizde eskiyi kapatmak icin finish() methodunu kullanabiliriz.
                finish();
            }
        });
    }
}
