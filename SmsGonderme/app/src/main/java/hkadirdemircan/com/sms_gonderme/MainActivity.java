package hkadirdemircan.com.sms_gonderme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView mesajListView;
    List<Model> list;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        listeDoldur();

    }

    public void tanimla(){
        mesajListView = (ListView) findViewById(R.id.mesajListView);
        list = new ArrayList<>();
    }

    public void listeDoldur(){
        Model m1 = new Model("Kadir","0000000000");
        Model m2 = new Model("Reha", "00000000000");
        Model m3 = new Model("Mikail", "0000000000");
        Model m4 = new Model("Burak", "0000000000");

        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        //adapter olusturup listView'a set ettik.
        adapter = new Adapter(list, this, this);
        mesajListView.setAdapter(adapter);

    }
}
