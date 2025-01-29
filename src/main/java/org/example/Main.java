package org.example;

import org.example.constance.Size;


public class Main {
    public static void main(String[] args) {
        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerTopping("BACON", "CHEESE", "MAYO");
        regularMeal.setDrinkSize(Size.LARGE);
        regularMeal.printItemizedList();

        MealOrder secondMeal = new MealOrder("turkey", "sprite", "chili");
        secondMeal.addBurgerTopping("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize(Size.SMALL);
        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "Pepsi", "fries");
        deluxeMeal.addBurgerTopping("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize(Size.SMALL);
        deluxeMeal.printItemizedList();
    }
}