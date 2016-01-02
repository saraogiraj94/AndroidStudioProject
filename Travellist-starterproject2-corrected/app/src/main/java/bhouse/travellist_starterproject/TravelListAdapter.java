package bhouse.travellist_starterproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by raj on 22/12/15.
 */
public class TravelListAdapter extends RecyclerView.Adapter<TravelListAdapter.ViewHolder>{
    Context mContext;
    // 2
    public TravelListAdapter(Context context) {
        this.mContext = context;
    }

    // 3

    @Override
    public int getItemCount() {
        return new PlaceData().placeList().size();
    }

    // 2
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_places, parent, false);
        return new ViewHolder(view,mContext);
    }
    // 3
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Place place = new PlaceData().placeList().get(position);
        holder.placeName.setText(place.name);
        Picasso.with(mContext).load(place.getImageResourceId(mContext)).into(holder.placeImage);
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
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
          //  placeHolder.setOnClickListener((View.OnClickListener) this);
        }


        @Override
        public void onClick(View view) {
            int pos= getPosition();
            Toast.makeText(this.context, "Clicked " + pos, Toast.LENGTH_SHORT).show();

        }
    }


}

