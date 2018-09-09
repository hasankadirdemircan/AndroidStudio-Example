package hkadirdemircan.com.spinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/*
Spinner
Kullainicya liste halndeki verilerden birin secmek icin kullanilan view elemandir.
il-ilce gibi

 */
public class MainActivity extends AppCompatActivity {

    String[] istanbulIlceleri = {"Ümraniye", "Kadirköy", "Ataşehir", "Avcular", "Arnavutköy", "Şişli"};
    ArrayAdapter arrayAdapter;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        adapterOlustur();
        spinnerAdapterEkle();
        tikla();
    }

    public void tanimla(){
        spinner = (Spinner) findViewById(R.id.spinner);
    }

    public void adapterOlustur(){
        arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,istanbulIlceleri);
    }

    public void spinnerAdapterEkle(){
        spinner.setAdapter(arrayAdapter);
    }

    public void tikla(){
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),spinner.getSelectedItem().toString(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
