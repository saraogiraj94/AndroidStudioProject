package com.example.raj.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by raj on 23/12/15.
 */
public class RecylerAdapter extends RecyclerView.Adapter<RecylerAdapter.RecyclerViewHolder>{

    String[] country_names,country_capitals;

    public RecylerAdapter(String[] country_names,String[] country_capitals){

        this.country_capitals=country_capitals;
        this.country_names=country_names;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder= new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.t1.setText(country_names[position]);
        holder.t2.setText(country_capitals[position]);
    }

    @Override
    public int getItemCount() {
        return country_names.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView t1,t2;
        public RecyclerViewHolder(View view){
            super(view);
            t1=(TextView)view.findViewById(R.id.tx_country_name);
            t2=(TextView)view.findViewById(R.id.tx_capital_name);
        }
    }
}
