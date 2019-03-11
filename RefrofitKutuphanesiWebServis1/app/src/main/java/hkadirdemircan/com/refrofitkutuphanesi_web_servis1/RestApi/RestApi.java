package hkadirdemircan.com.refrofitkutuphanesi_web_servis1.RestApi;

import java.util.List;

import hkadirdemircan.com.refrofitkutuphanesi_web_servis1.Models.Bilgiler;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {
    //istek atacagimiz pathi ve annotation u belirtiyoruz.
    //istekler buradan atilir.
    //Call ile bize donecek response u karsilariz.
    @GET("/posts")
    Call<List<Bilgiler>> bilgiGetir();

}
