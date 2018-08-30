package hkadirdemircan.com.toastmesaj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/* ToastMesaj
Mesaj olusturup, kullaniciya ekranda gostermeye yarayan elemandir.
Test islemlerinde, kullanicilara uyari,bilgi vermek için kullanilabilir.

getApplicationContext -> bulundugumuz sinifi temsil etmektedir.Veya this etiketi kullanabiliriz.
Toast.LENGTH_LONG -> mesajin ekranda uzun durmasini sagliyor.

 */
public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast Mesaj
        Toast.makeText(getApplicationContext(),"Toast mesaj deneme",Toast.LENGTH_LONG).show();
        tanimla();
        butonTikla();
    }

    public void tanimla(){
        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);
    }

    public void butonTikla(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = (int) (Math.random()*5+1);
                degistir(rnd);
                Toast.makeText(getApplicationContext(),String.valueOf(rnd) + "numaralı resim gösterildi",Toast.LENGTH_LONG).show();
            }
        });

    }

    public void degistir(int sayi){
        if(sayi==1){
            imageView.setImageResource(R.drawable.bir);
        }else if(sayi == 2){
            imageView.setImageResource(R.drawable.iki);
        }else if(sayi == 3){
            imageView.setImageResource(R.drawable.uc);
        }else if(sayi == 4){
            imageView.setImageResource(R.drawable.dort);
        }else{
            imageView.setImageResource(R.drawable.bes);
        }

    }
}
