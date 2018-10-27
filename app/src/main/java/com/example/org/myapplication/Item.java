package com.example.org.myapplication;

public class Item {

    private  String itemName;
    private String itemDesription;
    private  int imgId;

    public Item(String itemName, String itemDesription, int imgId) {
        this.itemName = itemName;
        this.itemDesription = itemDesription;
        this.imgId = imgId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDesription() {
        return itemDesription;
    }

    public int getImgId() {
        return imgId;
    }
}
