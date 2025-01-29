package org.example;

import org.example.constance.Type;

public class DeluxeBurger extends Burger {

    private Item deluxe1;
    private Item deluxe2;

    public DeluxeBurger(String name, Double price) {
        super(name, price);
    }

    public void addTopping(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addTopping(extra1,extra2,extra3);
        this.deluxe1 = new Item(Type.TOPPING , extra4,0.00);
        this.deluxe2 = new Item(Type.TOPPING , extra5,0.00);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (deluxe1 != null){
            deluxe1.printItem();
        }
        if (deluxe2 != null){
            deluxe2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
