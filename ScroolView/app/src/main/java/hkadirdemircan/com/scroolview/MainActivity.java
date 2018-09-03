package hkadirdemircan.com.scroolview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*ScroolView
tek activity'de yaptiklarimiz sigmaz, mesela gazete uygulamasinda asagi kaydirdikca okuruz.
ScroolView activity'e sigmayanlari koyariz.
ScroolView icerisine bir tane ana layout tanimlanir.iki tane tanimlanamaz.
Fakat layout icerisine birde nfazla yazabilriiz.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
