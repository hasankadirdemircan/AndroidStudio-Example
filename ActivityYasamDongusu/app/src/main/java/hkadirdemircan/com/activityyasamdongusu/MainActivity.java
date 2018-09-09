package hkadirdemircan.com.activityyasamdongusu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/*
onCreate() -> activity baslatildiginda yaratildiginda cagrilan method
onStart() -> activity kullanici tarafindan gorunur
onResume() -> uygulama icinde kullanici aktiftir, veri girebilir.
onPause() -> kullanici tarafindan girdi alinmaz, hicbir kod calismaz
onStop() -> activity gorunur durumda degil., baska activty 'e gecis yapilmistir.
onDestroy() -> activity sistem tarafindan silinmede ncalisir.
onRestrasrt() -> activty durdurktan sonra tekrar baslatilmak icin kullaniir.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("takip","onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Log.i("takip","onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("takip","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("takip","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("takip","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("takip","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("takip","onRestart");
    }
}
