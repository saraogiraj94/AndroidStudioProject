package com.example.arpit.mukti_2015_16;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TabFragment1 extends Fragment implements View.OnClickListener {
      View view;
      Button b;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.tab_fragment_1, container, false);
        b=(Button)view.findViewById(R.id.button2);
        b.setOnClickListener(this);
        return  view;
    }

    @Override
    public void onClick(View v) {

        //final Dialog d = new Dialog(this);
        // custom dialog
        final Dialog dialog = new Dialog(v.getContext());
        dialog.setContentView(R.layout.custom);
        dialog.setTitle("Co-ordinators");
        dialog.setCanceledOnTouchOutside(false);



        // set the custom dialog components - text, image and button


        Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
        // if button is clicked, close the custom dialog
        Button calla=(Button)dialog.findViewById(R.id.cbutton);
        //Button callb=(Button)dialog.findViewById(R.id.cbutton2);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        calla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:8460167576"));
                startActivity(callIntent);
                dialog.dismiss();

            }
        });
       /* callb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9979505840"));
                startActivity(callIntent);
                dialog.dismiss();

            }
        });*/


        dialog.show();


    }
}
