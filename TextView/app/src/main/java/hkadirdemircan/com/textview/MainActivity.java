package hkadirdemircan.com.textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/*TextView
bir yaziyi veya metni kullaniciya gostermek icin kullanilir.
 */
public class MainActivity extends AppCompatActivity {

    TextView textView1; // TextView nesne olusturduk.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        goster("Hasan Kadir");
    }

    private void tanimla(){
        textView1 = (TextView) findViewById(R.id.textView1); // id'si textView1 olan textView'i tanimladik.
    }

    private void goster(String kullaniciAdi){
        textView1.setText(kullaniciAdi);
    }
}
