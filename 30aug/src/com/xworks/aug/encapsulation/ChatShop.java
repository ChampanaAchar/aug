package com.xworks.aug.encapsulation;

public class ChatShop {
    private String shopName;
    private String chatName;
    private int noOfPlates;
    private String ratings;
    private int price;

    public ChatShop(){
        System.out.println("Chat time started");
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public String getShopName() {
        return shopName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }
    public String getChatName() {
        return chatName;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setNoOfPlates(int noOfPlates) {
        this.noOfPlates = noOfPlates;
    }
    public int getNoOfPlates() {
        return noOfPlates;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }
    public String getRatings() {
        return ratings;
    }
}
