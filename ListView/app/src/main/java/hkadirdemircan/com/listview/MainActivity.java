package hkadirdemircan.com.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/*ListView
kullanicilara birbiriyle iliskileri listeyle vermek icin listeleme islemi kullanilir.
kisi listesi, urun listesi..
sirasiyla;
veri listesi olustur,

 */
public class MainActivity extends AppCompatActivity {

    List<KullaniciModeli> kullaniciList; //pojo sinifi icin list tanimladik.
    KullaniciListAdapter adapter; //adapter tanimladik.

    ListView listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        listeDoldur();
    }

    public void tanimla(){
        //listview tanimladik.
        listView1 = (ListView) findViewById(R.id.listView1);
    }

    public void listeDoldur(){
        kullaniciList = new ArrayList<>();
        KullaniciModeli kullanici1 = new KullaniciModeli("kadir","22","demircan","java");
        KullaniciModeli kullanici2 = new KullaniciModeli("hasan","23","demircan","android");
        KullaniciModeli kullanici3 = new KullaniciModeli("msi","24","computer","c#");
        KullaniciModeli kullanici4 = new KullaniciModeli("tolga","22","varlioglu","abap");
        KullaniciModeli kullanici5 = new KullaniciModeli("reha","23","ertug","abap");

        kullaniciList.add(kullanici1);
        kullaniciList.add(kullanici2);
        kullaniciList.add(kullanici3);
        kullaniciList.add(kullanici4);
        kullaniciList.add(kullanici5);

        adapter = new KullaniciListAdapter(kullaniciList,this);

        listView1.setAdapter(adapter);//listView'a adapter i verdik.
    }

}
