package hkadirdemircan.com.mailgonderme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mailAdresEditText, mailKonuEditText, mailIcerikEditText;
    Button mailGonderButton;
    String mailAdres, mailKonu, mailIcerik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        tiklaMailAc();
    }

    public void tanimla(){

        mailAdresEditText = (EditText) findViewById(R.id.mailAdresEditText);
        mailKonuEditText = (EditText) findViewById(R.id.mailKonuEditText);
        mailIcerikEditText = (EditText) findViewById(R.id.mailIcerikEditText);

        mailGonderButton = (Button) findViewById(R.id.mailGonderButton);

    }

    public void bilgiAl(){
        mailAdres = mailAdresEditText.getText().toString();
        mailKonu = mailKonuEditText.getText().toString();
        mailIcerik = mailIcerikEditText.getText().toString();
    }

    public void tiklaMailAc(){

        //mail icerigi set ediyoruz.
        mailGonderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bilgiAl();
                try{
                    Intent ıntent = new Intent(Intent.ACTION_SEND);
                    ıntent.setType("message/rfc822"); //sabit bir type
                    ıntent.putExtra(Intent.EXTRA_EMAIL, mailAdres);// birden fazla mail varsa new String[] = ile olustur.
                    ıntent.putExtra(Intent.EXTRA_SUBJECT, mailKonu);
                    ıntent.putExtra(Intent.EXTRA_TEXT, mailIcerik);

                    startActivity(Intent.createChooser(ıntent, "Mail Gonderiniz !"));
                }catch (Exception e){
                    System.out.print("maile ulasilamadi.");
                }

            }
        });
    }
}
