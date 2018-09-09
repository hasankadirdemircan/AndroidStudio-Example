package hkadirdemircan.com.activityarasigecisornek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<Model> list;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        listeOlustur();
        gec();
    }

    public void tanimla(){
        list = new ArrayList<>();

        listView = (ListView) findViewById(R.id.listView);
        adapter = new Adapter(list,getApplicationContext(),this);

    }

    public void listeOlustur(){
        //model olusturuyoruz.
        Model m1 = new Model("hasan", "demircan" , "0523232323");
        Model m2 = new Model("Reha", "Ertug", "05054343");
        Model m3 = new Model("Tolga", "Varlioglu", "0542232323");
        Model m4 = new Model("Emre" ," adasdsad", "40403434");

        //list'e modelleri ekledik.
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
    }

    public  void gec(){
        listView.setAdapter(adapter);
    }

}
