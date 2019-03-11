package hkadirdemircan.com.picassoresimcekme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        resimCek();
    }

    public void tanimla(){
        imgView = (ImageView)findViewById(R.id.img);
    }
    public void resimCek(){
        Picasso.with(getApplicationContext()).load("https://cdn1.iconfinder.com/data/icons/universal-mobile-line-icons-vol-9/48/432-512.png").into(imgView);
    }
}
