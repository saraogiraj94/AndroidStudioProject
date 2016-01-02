package com.example.raj.st;

import java.util.ArrayList;

/**
 * Created by raj on 24/12/15.
 */
public class MyImgArray {
    public static String[] imgNameArray = {"Felt Cloth", "Marker Pen", "Packing Material", "Stationary", "Wool Fabric"};
    public static ArrayList<MyImg> placeList() {
        ArrayList<MyImg> list = new ArrayList<>();
        for (int i = 0; i < imgNameArray.length; i++) {
            MyImg myImg = new MyImg();
            myImg.name = imgNameArray[i];
            myImg.imageName = imgNameArray[i].replaceAll("\\s+", "").toLowerCase();
            list.add(myImg);
        }
        return (list);
    }

}
