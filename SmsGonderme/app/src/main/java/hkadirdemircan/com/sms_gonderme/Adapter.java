package hkadirdemircan.com.sms_gonderme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {

    List<Model> list;
    Context context;
    Activity activity; // activity class olmadigi icin activity aliyoruz.

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

        convertView = LayoutInflater.from(context).inflate(R.layout.layout,parent,false);//layout tanimlamasi

        //layout elemanliarinin tanimlanmasi
        //inner class odugu icin final yaptik.
        final EditText mesajIcerikEditText = (EditText) convertView.findViewById(R.id.mesajIcerikEditText);

        TextView isimTextView = (TextView) convertView.findViewById(R.id.isimTextView);
        TextView telTextView = (TextView) convertView.findViewById(R.id.telTextView);

        Button mesajGonderButton = (Button) convertView.findViewById(R.id.mesajGonderButton);

        //liste deki elemanlarin TextView'a set edilmesi.
        isimTextView.setText(list.get(position).getIsim());
        telTextView.setText(list.get(position).getTelNo());
        //telNo string'e attik.
        final String telNo = list.get(position).getTelNo().toString();

        //butona tiklanma olayi.
        mesajGonderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mesajIcerik = mesajIcerikEditText.getText().toString();
                Intent ıntent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + telNo));
                ıntent.putExtra("sms_body", mesajIcerik);
                activity.startActivity(ıntent);

            }
        });

        return convertView;
    }
}
