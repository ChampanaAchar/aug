package com.xworks.aug.encapsulation;

public class ChatShopRunner {
    public static void main(String[] args) {
        ChatShop shop=new ChatShop();
        shop.setShopName("Champs chat shop");
        shop.setChatName("DahiPuri");
        shop.setNoOfPlates(2);
        shop.setPrice(35);
        shop.setRatings("5 Star");

        System.out.println("Getting the details");
        System.out.println("Shop Name :"+shop.getShopName());
        System.out.println("chat name:"+shop.getChatName());
        System.out.println("No of plates:"+shop.getNoOfPlates());
        System.out.println("Price"+shop.getPrice());
        System.out.println("Ratings:"+shop.getRatings());
    }
}
