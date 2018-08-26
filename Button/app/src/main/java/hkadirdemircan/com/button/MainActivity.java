package hkadirdemircan.com.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/*Button
Kullanıcı dokunduğunda eylemi bildiren view elemanıdır.
Bir metin veya resim içerebilir.
 */

public class MainActivity extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// bu kod parcasi ile layout ekran tasarimi yuklenir.
        tanimla();
        islevVer();
    }
    // yapacagimiz islemleri, onCreate methodunda yapmak yerine baska bir methodda yapmaliyiz.
    // ve bu methodu onCreate methodu icerisinde tanimlamaliyiz.
    private void tanimla(){
        button1 = (Button) findViewById(R.id.button1); // id'si button1 olan butonu al button1'e tanimla.
    }

    private void islevVer(){
        //button1'e islevsellik veriyoruz.
        //button1'e tiklandiginda ne yapmasini istiyoruz.
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button'a tiklandiginda yapilmasi icin gereken kodlar.
                System.out.println("Butona tiklandi."); // console yazar.
            }
        });
    }
}
