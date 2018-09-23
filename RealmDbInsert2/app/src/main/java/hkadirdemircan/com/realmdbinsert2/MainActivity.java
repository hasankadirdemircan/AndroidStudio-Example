package hkadirdemircan.com.realmdbinsert2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    Realm realm;
    EditText kullaniciAdiEditText, isimEditText, sifreEditText;
    Button kayitOlBtn;
    RadioGroup cinsiyetRadioGrpBtn;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        realmTanimla();
        tanimla();
        ekle();
        goster();
    }

    public void realmTanimla(){
        realm = Realm.getDefaultInstance(); // opens "myrealm.realm"
    }

    public void tanimla(){
        kullaniciAdiEditText = (EditText) findViewById(R.id.kullaniciAdiEditText);
        isimEditText = (EditText) findViewById(R.id.isimEditText);
        sifreEditText = (EditText) findViewById(R.id.sifreEditText);
        kayitOlBtn = (Button) findViewById(R.id.kayitOlBtn);
        cinsiyetRadioGrpBtn = (RadioGroup) findViewById(R.id.cinsiyetRadioGrpBtn);

        listView = (ListView) findViewById(R.id.listView);
    }

    public void ekle(){

        kayitOlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Integer radioID = cinsiyetRadioGrpBtn.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) findViewById(radioID);//hangi radio butona tikladiysa onu aldik.
                final String cinsiyet = radioButton.getText().toString();
                final String kullaniciAdi = kullaniciAdiEditText.getText().toString();
                final String isim = isimEditText.getText().toString();
                final String sifre = sifreEditText.getText().toString();
                yaz(cinsiyet, isim, kullaniciAdi, sifre);
                kullaniciAdiEditText.setText("");
                isimEditText.setText("");
                sifreEditText.setText("");
                cinsiyetRadioGrpBtn.clearCheck();
            }
        });

    }

    public void yaz(final String cinsiyet, final String isim, final String kullaniciAdi, final String sifre){
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                //tablo class olustur
                KisiBilgileri kisiBilgileri = realm.createObject(KisiBilgileri.class);
                kisiBilgileri.setCinsiyet(cinsiyet);
                kisiBilgileri.setIsim(isim);
                kisiBilgileri.setKullaniciAdi(kullaniciAdi);
                kisiBilgileri.setSifre(sifre);
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                Toast.makeText(getApplicationContext(),"Başarılı Kayıt.",Toast.LENGTH_SHORT).show();
                goster();
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                Toast.makeText(getApplicationContext(),"Başarısız.",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void goster(){
        RealmResults<KisiBilgileri> kisiBilgileris = realm.where(KisiBilgileri.class).findAll();
        //listeyi gostereceiz.

        if(kisiBilgileris.size() > 0){
            Adapter adapter = new Adapter(kisiBilgileris,getApplicationContext());//adapter tanimladik.
            listView.setAdapter(adapter);

        }
    }
}
