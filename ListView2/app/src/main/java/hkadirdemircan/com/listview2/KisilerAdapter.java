package hkadirdemircan.com.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class KisilerAdapter extends BaseAdapter {

    private List<MesajModel> list;
    private Context context;

    public KisilerAdapter(List<MesajModel> list, Context context) {
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
        View layout = LayoutInflater.from(context).inflate(R.layout.layout, parent,false);

        //activity olmadigi icin direkt elemani cagiramiyoruz.
        ImageView imgView = (ImageView) layout.findViewById(R.id.kisiResmi);
        TextView isimText = (TextView) layout.findViewById(R.id.kisiIsim);
        TextView mesajText = (TextView) layout.findViewById(R.id.kisiMesaj); //layout'un belirtilen id'sini getir.

        imgView.setImageResource(list.get(position).getResimId());
        isimText.setText(list.get(position).getKisi());
        mesajText.setText(list.get(position).getMesajIcerik());

        return layout;
    }
}
