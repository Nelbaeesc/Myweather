package com.example.myweatherbase.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myweatherbase.R;
import com.example.myweatherbase.activities.model.Root;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private Root root;

    public MyRecyclerViewAdapter(Context context){
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public MyRecyclerViewAdapter(LayoutInflater inflater){
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.simple_element,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Date date = new Date((long)root.list.get(position).dt*1000);
        holder.dia.setText((new SimpleDateFormat("EEEE")).format(date));


//    Date date = new Date((long)root.list.get(position).dt*1000);
//    cambiarColor(holder.itemView, position);
//    holder.dia.setText((new SimpleDateFormat("EEEE")).format(date));
//    holder.estadoCielo.setText(root.getList().get(position).getWeather().get(0).getDescription());
//    holder.hora.setText(root.getList().get(position).dt_txt.substring(11,16));
//    holder.fecha.setText(root.getList().get(position).dt_txt.substring(0,11));
//    holder.max.setText("MAX: "+((String.valueOf(root.getList().get(position).main.temp_max).length()>=3)?String.valueOf(root.getList().get(position).main.temp_max).substring(0,3):root.getList().get(position).main.temp_max)+"º");
//    holder.min.setText("MAX: "+((String.valueOf(root.getList().get(position).main.temp_min).length()>=3)?String.valueOf(root.getList().get(position).main.temp_min).substring(0,3):root.getList().get(position).main.temp_min)+"º");
//    holder.temp.setText("Temp: "+root.getList().get(position).main.temp+"º");
//    ImageDownloader.downloadImage(Parameters.ICON_URL_PRE+root.getList().get(position).getWeather().get(0).icon+Parameters.ICON_URL_POST,holder.imagen);
    }

    @Override
    public int getItemCount() {
        return 9;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView dia;
        private TextView cielo;
        private TextView hora;
        private TextView fecha;
        private TextView max;
        private TextView min;
        private TextView temp;
        private ImageView imagen;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
        }
    }
}




