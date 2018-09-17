package hkadirdemircan.com.progressdialog;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * ProgressDialog
 * Uygula arka planda biseylerle mesgulken, bir urunlerin listesini gostermeye calisirken,
 * bize ekranda gostermesi sirasinda kullaniciya o sirada bir uyari verilmesi.
 * Arkada isleyen konu hakkında bilgi sahibi olmasini saglar.
 *
 * Activity icerisinde tanimlanir. xml de tanimlanmaz.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialogVer();
    }


    public void dialogVer(){
        final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);//progress dialog tanimladik.
        progressDialog.setTitle("Mesajlar Bölümü"); // baslik set ettik.
        progressDialog.setMessage("Mesajlar Listeleniyor..");// gorunecek mesaji set ediyoruz.

        progressDialog.setCancelable(false);//iptal edilebilirligi kapatiyoruz. Sebebi biz dialogu arka planda
        //islemler bitene kadar gostermek istiyoruz.
        progressDialog.show(); //progres dialog show edildi.
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(20000);//20 saniye boyunca ekranda gostermesi icin.
                }catch(Exception e){
                    e.printStackTrace();
                }

                progressDialog.cancel();// progress dialog'u kapattik.
            }
        }).start();


    }

}

