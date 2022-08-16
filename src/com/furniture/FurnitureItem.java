package com.furniture;

public class FurnitureItem {

    static final int DISCOUNT = 5;
    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private double price;

    public FurnitureItem() {

        furnitureCode = 0;
        furnitureType = null;
        gradeOfFurniture = null;
        color = null;
        furnitureUsage = null;
        price = 0.0;
    }

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float calculateDiscount() {

        float response = 0;
        if (getGradeOfFurniture().equals("grade1") && getFurnitureUsage().equals("outdoor"))
            response = (float) (getPrice() - (getPrice() * DISCOUNT / 100));

        return response;
    }
}
