package com.devexpert.marketapp.model;

public class Item {
    int itemImg;
    String itemTitle, itemDescription;

    public Item(int itemImg, String itemTitle, String itemDescription) {
        this.itemImg = itemImg;
        this.itemTitle = itemTitle;
        this.itemDescription = itemDescription;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}
