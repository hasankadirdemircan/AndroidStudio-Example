package hkadirdemircan.com.refrofitkutuphanesi_web_servis1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import hkadirdemircan.com.refrofitkutuphanesi_web_servis1.Models.Bilgiler;
import hkadirdemircan.com.refrofitkutuphanesi_web_servis1.R;

public class AdapterBilgi extends BaseAdapter {

    List<Bilgiler> list;
    Context context;

    public AdapterBilgi(List<Bilgiler> list, Context context) {
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
        //layout tanimlamasini yaptik.
        convertView = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);

        //layout'da bulunan textView'leri tanimladik.
        TextView userId = (TextView) convertView.findViewById(R.id.userId);
        TextView id = (TextView) convertView.findViewById(R.id.id);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView body = (TextView) convertView.findViewById(R.id.body);

        //layout'da bulunan textView'lere bilgieri set edecegiz.
        userId.setText((""+list.get(position).getUserId()));
        id.setText(""+list.get(position).getId());
        title.setText(list.get(position).getTitle());
        body.setText(list.get(position).getBody());

        return convertView;
    }
}
