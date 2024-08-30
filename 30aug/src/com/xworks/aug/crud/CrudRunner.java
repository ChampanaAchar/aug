package com.xworks.aug.crud;

public class CrudRunner {
    public static void main(String[] args) {

        boolean isAdded = Crud.createItems("Lays");
        System.out.println(isAdded);

        isAdded=Crud.createItems("Grocery");
        System.out.println(isAdded);

        isAdded=Crud.createItems("Sugar");
        System.out.println(isAdded);

        isAdded=Crud.createItems("coldDrinks");
        System.out.println(isAdded);

        isAdded=Crud.createItems("Flowers");
        System.out.println(isAdded);

        isAdded=Crud.createItems("Fruits");
        System.out.println(isAdded);

        isAdded=Crud.createItems("Books");
        System.out.println(isAdded);

        isAdded=Crud.createItems("clothes");
        System.out.println(isAdded);

        isAdded=Crud.createItems("Accessories");
        System.out.println(isAdded);

        isAdded=Crud.createItems("Milk");
        System.out.println(isAdded);

        boolean isUpdated=Crud.updateGoldItem("clothes","bag");
        System.out.println(isUpdated);

        Crud.getItems();
    }
}
