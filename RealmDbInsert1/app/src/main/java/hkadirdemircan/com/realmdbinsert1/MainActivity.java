package hkadirdemircan.com.realmdbinsert1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * 1) build.gradle ' a dependencies alanina realm-gradle ekle.
 * 2) build.gradle(app) alanina apply plugin realm ekle.
 * 3) android manifes xml icerisine .MyApplication'ı ekledik.
 * herhangi veritabani oalylari isleminde realm objesinde yapacagiz.
 */
public class MainActivity extends AppCompatActivity {

    Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        realmTanimla();//veritabani tanimlama.
        insertTable();
        selectTable();
    }

    public void realmTanimla(){
        realm = Realm.getDefaultInstance(); // opens "myrealm.realm"
    }


    public void insertTable(){
        realm.beginTransaction(); // islem yapabilmek icin transaction baslatmam gerek.
        //bu iki realm arasina ne yazarsam  arka arkaya toplu islem yapar.
        //Fakat realm.commitTransaction()'a gelmeden bir hata meydana gelirse realm.begin'den sonraki islemleri de iptal eder.
        //transaction commit edilince set edilir.
        KisilerTablosu kisilerTablosu = realm.createObject(KisilerTablosu.class);//Tablo tanimlamasi yaptik.
        kisilerTablosu.setKisiIsim("merhaba");
        kisilerTablosu.setKisiSoyisim("demircan");
        kisilerTablosu.setMaas(3);
        kisilerTablosu.setYas(27);

        realm.commitTransaction();// realm.begin den sonraki tum veriler db'ye islenir.
    }

    public void selectTable(){
        realm.beginTransaction();
        RealmResults<KisilerTablosu> sonuc = realm.where(KisilerTablosu.class).findAll();//kisiler tablosundaki tum veriyi cek.

        //verileri log'a basiyoruz.
        for(KisilerTablosu k : sonuc){
            Log.i("cikti", k.toString());
        }
        realm.commitTransaction();
    }
}
