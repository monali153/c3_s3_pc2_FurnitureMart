package com.furniture;

public class FurnitureItemImpl {

    public static void main(String[] args) {

        FurnitureItem object = new FurnitureItem();

        object.setFurnitureCode(101);
        object.setFurnitureType("table");
        object.setGradeOfFurniture("grade1");
        object.setFurnitureUsage("outdoor");
        object.setPrice(10);

        System.out.println("Discounted price is $" + object.calculateDiscount());
    }
}
