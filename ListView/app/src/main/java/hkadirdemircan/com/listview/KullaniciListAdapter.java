package hkadirdemircan.com.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class KullaniciListAdapter extends BaseAdapter{

    //modeli tipini olusturduk.
    List<KullaniciModeli> list;
    Context context;
    public KullaniciListAdapter (List<KullaniciModeli> list, Context context){
        this.list = list;
        this.context = context;

    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //olusturdugumuz layout.xml 'i tanimlayip, view'larin degerlerini adapter icerisinde atacagiz.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //layout tanimladik.
        View layout = LayoutInflater.from(context).inflate(R.layout.layout, parent,false);
        //textView java class'larinda boyle olusturuluyor. findViewById yok. View buyuzden olusturduk.
        TextView ad = (TextView) layout.findViewById(R.id.isim);
        TextView soyad = (TextView) layout.findViewById(R.id.soyad);
        TextView yas = (TextView) layout.findViewById(R.id.yas);
        TextView takim = (TextView) layout.findViewById(R.id.takim);

        //view'e set ediyoruz.
        ad.setText(list.get(position).getIsim());
        soyad.setText(list.get(position).getSoyad());
        yas.setText(list.get(position).getYas());
        takim.setText(list.get(position).getTakim());

        //view donduruyoruz.
        return layout;
    }
}
