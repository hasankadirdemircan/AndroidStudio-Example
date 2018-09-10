package hkadirdemircan.com.cagriyapma;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextPhone;
    Button aramaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        tiklaAramayaGec();
    }

    public void tanimla(){
        editTextPhone = (EditText) findViewById(R.id.editTextPhone);
        aramaButton = (Button) findViewById(R.id.aramaButton);
    }

    public void tiklaAramayaGec(){

        aramaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String telefonNumara = editTextPhone.getText().toString();
                Intent ıntent = new Intent(Intent.ACTION_DIAL);// arama islemi icin
                //ayrica arama islemi icin Android.Manifest.xml dosyasina izin yazmamiz lazim.
                ıntent.setData(Uri.parse("tel:" + telefonNumara)); //activity'e telefeon numarasini tasidik.
                startActivity(ıntent);

            }
        });
    }
}
