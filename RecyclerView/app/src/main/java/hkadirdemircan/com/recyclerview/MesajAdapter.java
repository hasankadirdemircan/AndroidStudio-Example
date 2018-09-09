package hkadirdemircan.com.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

//tanimla -> layout.xml icerindeki view elemanlarinin tanimlandigi
public class MesajAdapter extends RecyclerView.Adapter<MesajAdapter.viewTanimla>{

    List<MesajModel> list;
    Context context;

    public MesajAdapter(List<MesajModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public viewTanimla onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);
        return new viewTanimla(view);
    }

    @Override
    public void onBindViewHolder(viewTanimla holder, int position) {

        holder.mesajView.setText(list.get(position).getMesaj());
        holder.isimView.setText(list.get(position).getIsim());
      //  holder.imageView.setImageResource(list.get(position).getResimId());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewTanimla extends RecyclerView.ViewHolder{

        //view tanimlamalari;
        ImageView imageView;
        TextView isimView;
        TextView mesajView;

        //itemView ->
        public viewTanimla(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            isimView = (TextView) itemView.findViewById(R.id.isimView);
            mesajView = (TextView) itemView.findViewById(R.id.mesajView);

        }
    }

}
