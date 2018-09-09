package hkadirdemircan.com.activityarasigecisornek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView isim, soyisim, telNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tanimla();
        al();
    }

    public void tanimla(){
        isim = (TextView) findViewById(R.id.isim);
        soyisim = (TextView) findViewById(R.id.soyisim);
        telNo = (TextView) findViewById(R.id.telNo);
    }

    public void al(){
        //intent ile gelen verileri aliyrouz.
        Bundle bundle = getIntent().getExtras();
        String isimS = bundle.getString("isim");
        String soyisimS = bundle.getString("soyisim");
        String telNoS = bundle.getString("telNo");

        isim.setText(isimS);
        soyisim.setText(soyisimS);
        telNo.setText(telNoS);

    }
}
