package com.example.raj.st;

import android.content.Context;

/**
 * Created by raj on 24/12/15.
 */
public class MyImg {
    public String imageName;
    public String name;

    public int getImageResourceId(Context context){
        return context.getResources().getIdentifier(this.imageName,"drawable",context.getPackageName());
    }
}
