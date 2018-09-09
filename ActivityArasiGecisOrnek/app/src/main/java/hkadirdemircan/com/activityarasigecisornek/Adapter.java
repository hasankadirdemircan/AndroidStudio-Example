package hkadirdemircan.com.activityarasigecisornek;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {

    List<Model> list;
    Context context;//layout tanimlamak icin

    Activity activity; //ıntent kullanimi icin activity aliyoruz.

    public Adapter(List<Model> list, Context context, Activity activity) {
        this.list = list;
        this.context = context;
        this.activity = activity;
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

       // View layout veya;
        convertView = LayoutInflater.from(context).inflate(R.layout.layout, parent, false); //layout tanimladik.

        //textview'lara set ettik
        TextView isim = (TextView) convertView.findViewById(R.id.isimTextView);
        TextView soyisim = (TextView) convertView.findViewById(R.id.soyisimTextView);
        final TextView telNo = (TextView) convertView.findViewById(R.id.telNoTextView);

        LinearLayout linearLayout = convertView.findViewById(R.id.baseLinearLayout);

       final String isimS = list.get(position).getIsim();
       final String soyisimS = list.get(position).getSoyisim();
       final String telNoS = list.get(position).getTelNo();

       isim.setText(isimS);
       soyisim.setText(soyisimS);
       telNo.setText(telNoS);

       linearLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent ıntent = new Intent(context, Main2Activity.class);
               ıntent.putExtra("isim", isimS);
               ıntent.putExtra("soyisim", soyisimS);
               ıntent.putExtra("telNo", telNoS);
               activity.startActivity(ıntent);
           }
       });

        return convertView;
    }
}
