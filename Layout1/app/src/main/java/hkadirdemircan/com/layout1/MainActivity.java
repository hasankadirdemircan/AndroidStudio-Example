package hkadirdemircan.com.layout1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


/* layout -> res layout klasör altnıda bulunan mxl dosyası
xml -> kişilerin kendi sistemlerini oluştabilecekleri kendi etiketlerini tanmlayarak çok daha rahat etkin programlama yapabilecekleri ve bu belirlenene etiketleri
kendi yapıları içerisinde standartize edebilecekleri esnek genişleyebilir kolay uygulanabilir meta data dildir.
 */

/*
LinearLayout -> tüm içeriğin yatay veya dikey yönde hizalanması
bunu orientation niteliği ile yapıyor. horizontal, vertical.
LinearLayout 'da oriantation vermek zorundayız
 */

/*
match_parent ->  mobil cihazın tamamını kaplar
wrap_content -> layout içerisindeki imgelerin boyutları kadar boyut alır.
100dplik bir textview varsa 100 dp kadar olur.
 */

/*
gravity -> center text ortalar.
 */