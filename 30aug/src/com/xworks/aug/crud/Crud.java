package com.xworks.aug.crud;

public class Crud {
    public String name = "BlinkIt";
    public static String itemNames[] = {"null", "null", "null", "null", "null", "null", "null", "null", "null", "null"};
    public static int index;

    public static boolean createItems(String name) {
        boolean isCreated = false;
        if (name != null) {
            itemNames[index] = name;
            index++;
            isCreated = true;
        } else {
            System.out.println("Item not found");
        }
        return isCreated;
    }

    public static void getItems(){
        for(String itemName:itemNames)
            System.out.println(itemName);
    }

    public static boolean updateGoldItem(String oldItem,String newItem){
        boolean isItemUpdated=false;
        for(int index=0;index<itemNames.length;index++) {

            if(oldItem == itemNames[index]){
                itemNames[index]=newItem;
                isItemUpdated=true;
            }
        }
            if(isItemUpdated == false) System.out.println(oldItem + "not found");
            System.out.println(oldItem + " is replaced with " +newItem);
        return isItemUpdated;
    }
}
