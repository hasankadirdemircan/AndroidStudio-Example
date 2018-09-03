package hkadirdemircan.com.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/*RadioButton
ekranda tek bir secim yaptirmak istedigimizde kullanilan elemandir.
Radio button ayri ayri tanimlarsak hepsini secmek mumkun fakat radioGroup icersinide yaparsak tek birini secebiliriz.
 */
public class MainActivity extends AppCompatActivity {

    ImageView imageView1;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    RadioGroup radioGroupBtn;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
      //  islevVer(); // uzun yol
        butonTikla();
    }

    public void tanimla(){
        radioButton1 = (RadioButton) findViewById(R.id.radioBtn1);
        radioButton2 = (RadioButton) findViewById(R.id.radioBtn2);
        radioButton3 = (RadioButton) findViewById(R.id.radioBtn3);
        radioButton4 = (RadioButton) findViewById(R.id.radioBtn4);

        button1 = (Button) findViewById(R.id.button1);

        imageView1 = (ImageView) findViewById(R.id.imageView1);

        radioGroupBtn = (RadioGroup) findViewById(R.id.radioGroup1Btn);
    }
    public void butonTikla(){

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idAl();
            }
        });
    }


    public void idAl(){
        int id = radioGroupBtn.getCheckedRadioButtonId();
        resimDegistir(id);
    }

    public void resimDegistir(int id){
        if(id == R.id.radioBtn1){
            imageView1.setImageResource(R.drawable.bir);
            Toast.makeText(getApplicationContext(),radioButton1.getText(), Toast.LENGTH_SHORT).show();
        }else if(id == R.id.radioBtn2){
            imageView1.setImageResource(R.drawable.iki);
            Toast.makeText(getApplicationContext(),radioButton2.getText(), Toast.LENGTH_SHORT).show();
        }else if(id == R.id.radioBtn3){
            imageView1.setImageResource(R.drawable.uc);
            Toast.makeText(getApplicationContext(),radioButton3.getText(), Toast.LENGTH_SHORT).show();
        }else{
            imageView1.setImageResource(R.drawable.dort);
            Toast.makeText(getApplicationContext(), radioButton4.getText(), Toast.LENGTH_SHORT).show();
        }
    }

    //uzun yolu
    public void islevVer(){
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.bir);
                Toast.makeText(getApplicationContext(),radioButton1.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.iki);
                Toast.makeText(getApplicationContext(),radioButton2.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.uc);
                Toast.makeText(getApplicationContext(),radioButton3.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        radioButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.dort);
                Toast.makeText(getApplicationContext(), radioButton4.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
