package hkadirdemircan.com.sms_gonderme;

public class Model {
    private String isim;
    private String telNo;

    public Model(String isim, String telNo) {
        this.isim = isim;
        this.telNo = telNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
