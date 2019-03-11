package hkadirdemircan.com.refrofitkutuphanesi_web_servis1.RestApi;


import java.util.List;

import hkadirdemircan.com.refrofitkutuphanesi_web_servis1.Models.Bilgiler;
import retrofit2.Call;

//restapi icerisindeki istegi tetiklerim ve  donen sonucu burada alırım.
public class ManagerAll extends BaseManager{
    private static ManagerAll ourInstance  = new ManagerAll();

    public static synchronized ManagerAll getInstance(){
        return  ourInstance;
    }
    //model class i veriyoruz. burada istegi atmak icin restapi'yi tetikliyoruz. MainActivity burayi tetiklemeli.
    //bilgi getir http get istegini ManagerAll classindan kontrol ediyoruz.
    public Call<List<Bilgiler>> getirBilgileri(){
        Call<List<Bilgiler>> call = getRestApiClient().bilgiGetir();
        return call;
    }
}
