package hkadirdemircan.com.sharedprefences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Normalde uygulamayi acip kapattigimizda kullanicinin girdigi bilgiler silinir.
         * Elimizde bulunmaz.
         * Bu  bilgiyi kaybetmemek icin SharedPreferences kullanabiliriz.
         * SharedPrefences cok buyuk verileri tutmak icin degil, bikac bilgiyi tutmak icin kullanilir.
         * Ornegin kullanici uygulamaya uyeadi ve sifre ile giris yaptiginda
         * uygulamayi kapat ac yaptiginda tekrar uyeadi ve sifre istememesi gibi durumlarda sikca kullanilir.
         *
         */

        /**
         * MODE_PRIVATE  uygulamamizdan sadece biz erisebiliriz.
         * name kisminda package ismini yaziyoruz.
         */
        SharedPreferences sharedPreferences = this.getSharedPreferences("hkadirdemircan.com.sharedprefences;", Context.MODE_PRIVATE);

        int age = 40;//kullanicidan aldik varsayalim.

        /**
         * buradaki "userAge" bizim key'imiz oluyor. bilgili cekerken bu key ile cekecegiz.
         */
       sharedPreferences.edit().putInt("userAge",age).apply();//program 1 kez calisinca bu bigliler kayit edilir.

        /**
         * key'imiz ile bilgiyi cekiyoruz. Eger userAge key'inden bilgi cekemezsek default olarak 0 atiyoruz.
         */
        int savedAge = sharedPreferences.getInt("userAge",0);

        System.out.println("saved Age : " + savedAge);

        /**
         * peki bilgi degisirse nasil guncelleriz ?
         */
        age=45; //diyelim guncellendi farkli bir deger geldi. age=45 oldu

        sharedPreferences.edit().putInt("userAge",age).apply(); //userAge key'in guncel bilgisi 45 oldu.
        int savedAge2 = sharedPreferences.getInt("userAge",0); //son degeri savedAge2 'ye attik.
        System.out.println("updated Age : " + savedAge2);


        /**
         * Peki nasıl Sileriz ?
         * Bu özelligi nasil Sileriz ?
         */

        sharedPreferences.edit().remove("userAge"); //remove edilecek key' i veriyoruz.

        //sildigimiz icin bir deger bulamayacak ve sistem bize 0 verecek.
        int saved3  = sharedPreferences.getInt("userAge",0);


    }
}
