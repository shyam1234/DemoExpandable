package com.malviya.demoexpandable;

/**
 * Created by Admin on 20-01-2017.
 */

public class ExpandedMenuModel {

    String iconName = "";
    int iconImg = -1; // menu icon resource id

    public String getIconName() {
        return iconName;
    }
    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
    public int getIconImg() {
        return iconImg;
    }
    public void setIconImg(int iconImg) {
        this.iconImg = iconImg;
    }
}