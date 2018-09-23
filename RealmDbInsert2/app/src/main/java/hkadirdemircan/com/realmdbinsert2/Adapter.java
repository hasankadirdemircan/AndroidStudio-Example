package hkadirdemircan.com.realmdbinsert2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {

    List<KisiBilgileri> list;
    Context context;

    public Adapter(List<KisiBilgileri> list, Context context) {
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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.layout,parent,false); // layout tanimladik.
        TextView kullaniciAdiText = convertView.findViewById(R.id.kullaniciAdiText);
        TextView kullaniciSifreText = convertView.findViewById(R.id.kullaniciSifreText);
        TextView cinsiyetText = convertView.findViewById(R.id.cinsiyetText);
        TextView kullaniciisim = convertView.findViewById(R.id.kullaniciisim);

        kullaniciAdiText.setText(list.get(position).getIsim());
        kullaniciSifreText.setText(list.get(position).getSifre());
        cinsiyetText.setText(list.get(position).getCinsiyet());
        kullaniciisim.setText(list.get(position).getIsim());


        return convertView;
    }
}
