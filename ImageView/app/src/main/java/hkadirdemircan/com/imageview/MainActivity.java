package hkadirdemircan.com.imageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/*ImageView
Ekranda resim gostermemizi saglayan view elemanidir.
 */
public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        tikla();
    }

    public void tanimla(){
        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);
    }

    public void tikla(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = (int)(Math.random()*5+1);
                System.out.println(rnd);
                degistir(rnd);
            }
        });
    }

    public void degistir(int rnd){
        if(rnd == 1){
            imageView.setImageResource(R.drawable.bir);
        }else if(rnd == 2){
            imageView.setImageResource(R.drawable.iki); // image resource degistirerek istedigimizi image koyabiliriz.
        }else if(rnd == 3){
            imageView.setImageResource(R.drawable.uc);
        }else if(rnd == 4){
            imageView.setImageResource(R.drawable.dort);
        }else {
            imageView.setImageResource(R.drawable.bes);
        }
    }

}
