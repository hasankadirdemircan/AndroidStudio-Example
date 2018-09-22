package hkadirdemircan.com.realmdbinsert1;

import io.realm.RealmObject;
import io.realm.annotations.RealmClass;

/**
 * CRUD islemleri bu obje uzerinden yuruyecek.
 */

@RealmClass
public class KisilerTablosu extends RealmObject {
    private String kisiIsim;
    private String kisiSoyisim;
    private Integer maas;
    private Integer yas;

    public String getKisiIsim() {
        return kisiIsim;
    }

    public void setKisiIsim(String kisiIsim) {
        this.kisiIsim = kisiIsim;
    }

    public String getKisiSoyisim() {
        return kisiSoyisim;
    }

    public void setKisiSoyisim(String kisiSoyisim) {
        this.kisiSoyisim = kisiSoyisim;
    }

    public Integer getMaas() {
        return maas;
    }

    public void setMaas(Integer maas) {
        this.maas = maas;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "KisilerTablosu{" +
                "kisiIsim='" + kisiIsim + '\'' +
                ", kisiSoyisim='" + kisiSoyisim + '\'' +
                ", maas=" + maas +
                ", yas=" + yas +
                '}';
    }
}
