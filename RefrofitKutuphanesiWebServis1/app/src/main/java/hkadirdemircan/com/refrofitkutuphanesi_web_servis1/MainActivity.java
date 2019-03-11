package hkadirdemircan.com.refrofitkutuphanesi_web_servis1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import hkadirdemircan.com.refrofitkutuphanesi_web_servis1.Models.Bilgiler;
import hkadirdemircan.com.refrofitkutuphanesi_web_servis1.RestApi.ManagerAll;
import hkadirdemircan.com.refrofitkutuphanesi_web_servis1.adapters.AdapterBilgi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Bilgiler> list;
    ListView listView; //servisden donen bilgileri listView'e basmak icin.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        istek();
    }
    public  void tanimla(){
        listView = (ListView) findViewById(R.id.list_view); // listview tanimladik.
    }
    public void istek(){
        list = new ArrayList<>();
        //http get istegini tetikledik.
        Call<List<Bilgiler>> bilgiList = ManagerAll.getInstance().getirBilgileri();
        bilgiList.enqueue(new Callback<List<Bilgiler>>() {
            @Override
            public void onResponse(Call<List<Bilgiler>> call, Response<List<Bilgiler>> response) {
                if (response.isSuccessful()){ //sonuc basarili ise,
                    //gelen sonucun body'sini list'e attik.
                    list =  response.body();
                    //donen bilgileri adapter'a set ettik.
                    AdapterBilgi adapterBilgi = new AdapterBilgi(list,getApplicationContext());
                    listView.setAdapter(adapterBilgi);
                }

            }

            @Override
            public void onFailure(Call<List<Bilgiler>> call, Throwable t) {

            }
        });
    }
}
