package hkadirdemircan.com.refrofitkutuphanesi_web_servis1.RestApi;

//restapi client'ın nesnesini olustrup url i verecegiz ve restapiyi dondurecek

public class BaseManager {

    protected RestApi getRestApiClient(){
        RestApiClient restApiClient = new RestApiClient(BaseUrl.bilgi_url);
        return restApiClient.getRestApi();
    }
}
