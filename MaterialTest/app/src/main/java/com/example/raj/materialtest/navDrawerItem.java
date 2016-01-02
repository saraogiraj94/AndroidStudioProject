package com.example.raj.materialtest;

/**
 * Created by raj on 22/12/15.
 */
public class navDrawerItem {
    private boolean showNotify;
    private String title;


    public navDrawerItem() {

    }

    public navDrawerItem(boolean showNotify, String title) {
        this.showNotify = showNotify;
        this.title = title;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
