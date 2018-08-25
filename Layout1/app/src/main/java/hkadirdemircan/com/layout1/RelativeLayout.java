package hkadirdemircan.com.layout1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RelativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    }
}

/*
RelativeLayout -> içerik göreceli olarak tanımlanır.
Bir view'a göre diğer view'ın hizalanması.
Yani iki tane view var ve ikincisini birincinin altına koymak istiyorsak,
ikinciye blow deyip birincinin id'sini verip yapabiliriz.

 */