package hkadirdemircan.com.listview2;

public class MesajModel {

    private String mesajIcerik;
    private  String kisi;
    private int resimId;

    public MesajModel(String mesajIcerik, String kisi, int resimId) {
        this.mesajIcerik = mesajIcerik;
        this.kisi = kisi;
        this.resimId = resimId;
    }

    public String getMesajIcerik() {
        return mesajIcerik;
    }

    public void setMesajIcerik(String mesajIcerik) {
        this.mesajIcerik = mesajIcerik;
    }

    public String getKisi() {
        return kisi;
    }

    public void setKisi(String kisi) {
        this.kisi = kisi;
    }

    public int getResimId() {
        return resimId;
    }

    public void setResimId(int resimId) {
        this.resimId = resimId;
    }
}
