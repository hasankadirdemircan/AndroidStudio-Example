package hkadirdemircan.com.activitylerarasiverialma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText editTextKullanici,editTextSifre;
    Button buttonGonder;
    RadioGroup radioCinsiyetGroup;
    RadioButton radioErkek,radioKadin;

    String kullaniciAdi, kullaniciSifre, kullaniciCinsiyet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        tikla();
    }

    public void tanimla(){

        editTextKullanici = (EditText) findViewById(R.id.editTextKullanici);
        editTextSifre = (EditText) findViewById(R.id.editTextSifre);

        buttonGonder = (Button) findViewById(R.id.buttonGonder);

        radioCinsiyetGroup = (RadioGroup) findViewById(R.id.radioCinsiyetGroup);

        radioErkek = (RadioButton) findViewById(R.id.radioErkek);
        radioKadin = (RadioButton) findViewById(R.id.radioKadin);

    }
    //girilen degerler String'e set ediliyor.
    public void degerAl(){
        kullaniciAdi = editTextKullanici.getText().toString();
        kullaniciSifre = editTextSifre.getText().toString();

        //radio group icrisinden secilenin text'ini al.
        kullaniciCinsiyet = ((RadioButton) findViewById(radioCinsiyetGroup.getCheckedRadioButtonId())).getText().toString();

    }
    public void tikla(){

        buttonGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degerAl();
                Intent ıntent = new Intent(MainActivity.this, IkinciActivity.class);
                //verileri ikinci activity'e gonderecegiz.
                //gondermek icin putExtra kullaniyoruz.
                ıntent.putExtra("kullaniciAdi", kullaniciAdi);
                ıntent.putExtra("kullaniciSifre", kullaniciSifre);
                ıntent.putExtra("kullaniciCinsiyet",kullaniciCinsiyet);
                startActivity(ıntent);
            }
        });
    }
}
