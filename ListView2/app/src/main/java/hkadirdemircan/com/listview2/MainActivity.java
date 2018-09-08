package hkadirdemircan.com.listview2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView1;
    List<MesajModel> listMesajModel;
    KisilerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        listDoldur();

    }

    public void tanimla(){
        listView1 = (ListView) findViewById(R.id.listView1);
    }

    public void listDoldur(){
        listMesajModel = new ArrayList<>();
        MesajModel m1  = new MesajModel("merhaba nasılsın","Hasan",R.drawable.user1);
        MesajModel m2 = new MesajModel("heyyy","Kadir", R.drawable.user1);
        MesajModel m3 = new MesajModel("hobbaaaa","demircan",R.drawable.user1);

        listMesajModel.add(m1);
        listMesajModel.add(m2);
        listMesajModel.add(m3);

        //adapter tanimlayip list'i gomuyoruz.
        adapter = new KisilerAdapter(listMesajModel, this);
        //listView'e set ediyoruz.
        listView1.setAdapter(adapter);
    }

}
