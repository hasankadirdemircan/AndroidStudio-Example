package hkadirdemircan.com.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/*RecyclerView
list elemanlarinin ekranda gorunmesi islemini saglar.
android 5.0 ile gelmistir. Uygulamalara daha guze lgorunum saglar.
listview farki -> daha esnek, hem yatay hem dikey konumlanan layout vardir.
verilerin konumlamasını yonetmek icin LayoutManager yapisi kullanir.
RecyclerView kutuphanemize dahil etmemiz gerekmektedir.
build.gradle(app) -> dependency icerisine internetten bulup ekleyebiliriz.

 */
public class MainActivity extends AppCompatActivity {

    RecyclerView.LayoutManager layoutManager;
    List<MesajModel> list;
    RecyclerView recyclerView;
    MesajAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        listeDoldur();
    }

    public void tanimla(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);//layout manager set ettik.
    }

    public void listeDoldur(){
        list = new ArrayList<>();

        MesajModel m1 = new MesajModel("Hasan","merhaba",R.drawable.user1);
        MesajModel m2 = new MesajModel("Kadir", "napıyorsun", R.drawable.user1);
        MesajModel m3 = new MesajModel("Demircan","ya bugün neler oldu",R.drawable.user1);

        list.add(m1);
        list.add(m2);
        list.add(m3);

        adapter = new MesajAdapter(list,this);

        recyclerView.setAdapter(adapter);
    }
}
