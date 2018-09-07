package hkadirdemircan.com.listview;

public class KullaniciModeli {
    private String isim;
    private String yas;
    private String soyad;
    private String takim;

    public KullaniciModeli(String isim, String yas, String soyad, String takim) {
        this.isim = isim;
        this.yas = yas;
        this.soyad = soyad;
        this.takim = takim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTakim() {
        return takim;
    }

    public void setTakim(String takim) {
        this.takim = takim;
    }
}
