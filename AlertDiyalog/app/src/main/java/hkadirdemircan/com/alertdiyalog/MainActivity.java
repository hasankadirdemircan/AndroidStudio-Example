package hkadirdemircan.com.alertdiyalog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**Alert Diyalog
 * ListView'de oldugu gibi alet diyalog da xml dosyasi olusturulmali.
 * Anket, secim yapmak, resim buyutme islemi ..
 * Alert dialog icin, LayoutInfalter olusturmamiz lazim.
 *
 */
public class MainActivity extends AppCompatActivity {

    Button alertAcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
    }

    public void tanimla(){
        alertAcButton = (Button) findViewById(R.id.alertAcButton);

        alertAcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogAc();
            }
        });
    }

    public void dialogAc(){

        LayoutInflater ınflater = getLayoutInflater(); // layout tanimladik.
        View view = ınflater.inflate(R.layout.alertlayout, null);//view olusturduk.

        final EditText isimEditText = (EditText) view.findViewById(R.id.isimEditText);
        final EditText mailEditText = (EditText) view.findViewById(R.id.mailEditText);
        final EditText sifreEditText = (EditText) view.findViewById(R.id.sifreEditText);
        Button uyeOlButton = (Button) view.findViewById(R.id.uyeOlButton);
        Button iptalButton = (Button) view.findViewById(R.id.iptalButton);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);//layout gecisi icin
        alert.setView(view);//goruntulenecek olan layout

        //butona tikladigimda kaybolsun diyorsak;
        alert.setCancelable(false);// ekranda bos bi yere tikladigimizda kapanmaz, butona tiklayinca kapanir.
        final AlertDialog dialog = alert.create();

        uyeOlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), mailEditText.getText().toString()+ " "+ isimEditText.getText().toString()+ " "+
                        sifreEditText.getText().toString(), Toast.LENGTH_LONG).show();
                dialog.cancel();// butona tiklayinca alert dialog kapanmasi icin.
            }
        });

        //iptal butonuna tiklayinca dialog'ta islem yapmadan kapatacak.
        iptalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        dialog.show(); // butona tiklayinca alert dialog acilmasi icin // 57.satirada yazsak olur.

    }
}
