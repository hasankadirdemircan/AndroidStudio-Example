package hkadirdemircan.com.activityarasigecisornek;

public class Model {
    private String isim;
    private String soyisim;
    private String telNo;

    public Model(String isim, String soyisim, String telNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.telNo = telNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
