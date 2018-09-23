package hkadirdemircan.com.realmdbinsert2;

import io.realm.RealmObject;
import io.realm.annotations.RealmClass;

@RealmClass
public class KisiBilgileri extends RealmObject {

    private String kullaniciAdi;
    private String isim;
    private String cinsiyet;
    private String sifre;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    @Override
    public String toString() {
        return "KisiBilgileri{" +
                "kullaniciAdi='" + kullaniciAdi + '\'' +
                ", isim='" + isim + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", sifre='" + sifre + '\'' +
                '}';
    }
}
