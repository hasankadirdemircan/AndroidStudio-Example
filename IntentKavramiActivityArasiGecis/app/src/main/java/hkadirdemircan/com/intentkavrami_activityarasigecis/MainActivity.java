package hkadirdemircan.com.intentkavrami_activityarasigecis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*Intent
bir activityden baska bir activitye gecis icin kullanilir, gidilen activity' bilgiler gonderilebilir.
kamera,takvim calistirilmasi icinde kullanilir.
resim gosterme, mail gonderme, numara arama -> dolayli intent
 */
public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        tikla();
    }

    public void tanimla(){
        button = (Button) findViewById(R.id.button);
    }
    public void gecisYap(){
        Intent ıntent = new Intent(MainActivity.this,IkinciActivity.class);
        startActivity(ıntent);
    }

    public void tikla(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gecisYap();
            }
        });
    }
}
