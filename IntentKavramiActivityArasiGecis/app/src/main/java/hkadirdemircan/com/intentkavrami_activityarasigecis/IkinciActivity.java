package hkadirdemircan.com.intentkavrami_activityarasigecis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class IkinciActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci);

        tanimla();
        tikla();
    }

    public void tanimla(){
        textView = (TextView) findViewById(R.id.textView);
    }

    public void tikla(){
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ıntent = new Intent(IkinciActivity.this, MainActivity.class);
                startActivity(ıntent);
            }
        });
    }
}
