package org.example;

import org.example.constance.Size;
import org.example.constance.Type;


public class Item {

    private Type type;
    private String name;
    private Double price;
    private Size size = Size.MEDIUM;

    public Item(Type type, String name, Double price) {
        this.type = type;
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getName() {
        if (type.equals(Type.SIDE) || type.equals(Type.DRINK) ){
            return size.name() + " " + name;
        }
        return name;
    }

    public Double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice(){
        return switch (size) {
            case SMALL -> getBasePrice() - 0.5;
            case LARGE -> getBasePrice() + 1 ;
            default -> getBasePrice();
        };
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n", name , price);
    }

    public void printItem(){
        printItem(getName() , getAdjustedPrice());
    }
}


