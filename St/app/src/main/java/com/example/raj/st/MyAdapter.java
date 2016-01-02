package com.example.raj.st;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
/**
 * Created by raj on 24/12/15.
 */
 class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    Context context;
    public MyAdapter(Context context){
        this.context=context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_places,parent,false);
        return new ViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final MyImg place = new MyImgArray().placeList().get(position);
        holder.placeName.setText(place.name);
        Picasso.with(context).load(place.getImageResourceId(context)).into(holder.placeImage);
    }

    @Override
    public int getItemCount() {
        return new MyImgArray().placeList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public LinearLayout placeHolder;
        public LinearLayout placeNameHolder;
        public TextView placeName;
        public ImageView placeImage;
        Context context;

        public ViewHolder(View itemView,Context context) {
            super(itemView);
            this.context=context;
            itemView.setOnClickListener(this);
            placeHolder = (LinearLayout) itemView.findViewById(R.id.mainHolder);
            placeName = (TextView) itemView.findViewById(R.id.placeName);
            placeNameHolder = (LinearLayout) itemView.findViewById(R.id.placeNameHolder);
            placeImage = (ImageView) itemView.findViewById(R.id.placeImage);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
