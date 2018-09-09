package hkadirdemircan.com.activitylerarasiverialma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class IkinciActivity extends AppCompatActivity {

    TextView kullaniciAdiTextView, kullaniciSifreTextView, kullaniciCinsiyetTextView;
    String kullaniciAdi;
    String kullaniciSifre;
    String kullaniciCinsiyet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci);

        tanimla();
        al();
    }

    public void tanimla(){
        kullaniciAdiTextView = (TextView) findViewById(R.id.kullaniciAdiTextView);
        kullaniciSifreTextView = (TextView) findViewById(R.id.kullaniciSifreTextView);
        kullaniciCinsiyetTextView = (TextView) findViewById(R.id.kullaniciCinsiyetTextView);
    }
    public void al(){
        //Bundle
        //activity'ler arasi data gecisi icin.
        Bundle ıntent = getIntent().getExtras();
        kullaniciAdi = ıntent.getString("kullaniciAdi");
        kullaniciSifre = ıntent.getString("kullaniciSifre");
        kullaniciCinsiyet = ıntent.getString("kullaniciCinsiyet");
        textVieweYaz();

        Log.i("Degerler_2", kullaniciAdi+" "+kullaniciSifre+" "+kullaniciCinsiyet);
    }
    public void textVieweYaz(){
        kullaniciAdiTextView.setText(kullaniciAdi);
        kullaniciSifreTextView.setText(kullaniciSifre);
        kullaniciCinsiyetTextView.setText(kullaniciCinsiyet);
    }
}
