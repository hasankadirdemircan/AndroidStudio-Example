package hkadirdemircan.com.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

/* Checkbox
kullaniciya secenek sunarak birini bir kacini veya tamaminin secilmesini istenen durumlar icin kullanilir.
Anket uygulamasi -> hangi dilleri biliyorsunuz ? gibi.
 */
public class MainActivity extends AppCompatActivity {

    CheckBox phpCheckbox, javaCheckbox, androidCheckbox, csharpCheckbox, jsCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        mesajVer();
    }

    public void tanimla(){
        phpCheckbox = (CheckBox) findViewById(R.id.phpCheckbox);
        javaCheckbox = (CheckBox) findViewById(R.id.javaCheckbox);
        androidCheckbox = (CheckBox) findViewById(R.id.androidCheckbox);
        csharpCheckbox = (CheckBox) findViewById(R.id.csharpCheckbox);
        jsCheckbox = (CheckBox) findViewById(R.id.jsCheckbox);

    }

    public void mesajVer(){

        phpCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(phpCheckbox.isChecked()){
                    Toast.makeText(getApplicationContext(),phpCheckbox.getText()+ " seçildi.", Toast.LENGTH_LONG) .show();
                }else{
                    Toast.makeText(getApplicationContext(), phpCheckbox.getText() + " iptal edildi.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        javaCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(javaCheckbox.isChecked()){
                    Toast.makeText(getApplicationContext(), javaCheckbox.getText() + " seçildi.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),javaCheckbox.getText() + " iptal edildi.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        androidCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(androidCheckbox.isChecked()){
                    Toast.makeText(getApplicationContext(),androidCheckbox.getText() + " seçildi.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), androidCheckbox.getText() + " iptal edildi.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        csharpCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(csharpCheckbox.isChecked()){
                    Toast.makeText(getApplicationContext(), csharpCheckbox.getText() + " seçildi.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), csharpCheckbox.getText() + " iptal edildi.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        jsCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jsCheckbox.isChecked()){
                    Toast.makeText(getApplicationContext(), jsCheckbox.getText() + " seçildi.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), jsCheckbox.getText() + " iptal edildi.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
