package hkadirdemircan.com.timer;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);

       new CountDownTimer(10000,1000){

           @Override
           public void onTick(long millisUntilFinished) {
               //her saniye ne yapacagini

               textView.setText("Left : " + millisUntilFinished / 1000);
           }

           @Override
           public void onFinish() {
            //bitince yapacagi sey
               Toast.makeText(getApplicationContext(),"Time's Done", Toast.LENGTH_LONG).show();
               textView.setText("Left : 0");


           }
       }.start();
    }
}
