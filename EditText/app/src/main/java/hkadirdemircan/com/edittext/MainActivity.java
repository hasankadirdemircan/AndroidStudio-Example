package hkadirdemircan.com.edittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*EditText
kullanicilarin veri girmesini saglayan bir view elemanidir.
 */
public class MainActivity extends AppCompatActivity {

    EditText editText1;
    Button hesaplaButton;
    TextView sonucTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tiklama();
    }

    private void tanimla(){
        editText1 = (EditText) findViewById(R.id.editText1);
        hesaplaButton = (Button) findViewById(R.id.hesaplaButton);
        sonucTextView = (TextView) findViewById(R.id.sonucTextView);
    }
    //butona tiklayinca hesaplama yapilacak method
    private void tiklama(){

        hesaplaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String deger = editText1.getText().toString(); //editText icerisine girilen degeri aliyoruz.
                int fakHesapla = Integer.parseInt(deger);//String olan degeri integer yaptik.
                int faktoriyel = hesapla(fakHesapla);
                sonucTextView.setText("Sonuc = " + faktoriyel);
            }
        });
    }
    //faktoriyel hesaplayan fonksiyon
    private int hesapla(int sayi){
        int sonuc = 1;
        for(int i=sayi; i>=1; i--){
            sonuc *= i;
        }
        return sonuc;
    }
}
