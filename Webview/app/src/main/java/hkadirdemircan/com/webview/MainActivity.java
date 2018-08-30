package hkadirdemircan.com.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

/*Webview
hem uzak sonucu web sayfalarini,hem uygulama icerisine koydugumuz html dosyalarini goruntulemeye saglayan view elemanidir.
javascript kodlarinin calismasini onaylamak icin 30. satirda yazdgimiz kodu true yapmamiz gerekmektedir.

Ayrica internet izni almak gerekir, bunun icinde -> app -> manifests -> AndroidManifest.xml -> icerisine
 <uses-permission android:name="android.permission.INTERNET"></uses-permission>  yazmaliyiz.
 */
public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
       // goster(); URL'den cekmek
        gosterHtml(); //kendimiz tanimladigimiz kodlar
    }

    public void tanimla(){
        webView = (WebView) findViewById(R.id.webView);
    }

    public void goster(){

        webView.getSettings().setJavaScriptEnabled(true);//web sitesindeki js kodlarinin calistirilmasini onayliyoruz.
        webView.loadUrl("http://hkdemircan.com");
    }

    public void gosterHtml(){
        webView.getSettings().setJavaScriptEnabled(true);//web sitesindeki js kodlarinin calistirilmasini onayliyoruz.

        String htmlkodu = "<html> <head>WebView</head> <body> <h1>Hasan Kadir Demircan</h1> </body>";
        webView.loadData(htmlkodu,"text/html","UTF-8");
    }
}
