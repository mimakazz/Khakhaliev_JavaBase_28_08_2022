package com.hillel.khakhaliev.homeworks.homework11;

public class BurgerWithoutMayonnaise extends Burger {
    public BurgerWithoutMayonnaise(String bap, String meat, String cheese, String green) {
        super(bap, meat, cheese, green, false);
    }

    public static String createBurger(String bap, String meat, String cheese, String green) {
        String BurgerWithoutMayonnaise = new String("diet burger is " + bap + " ," + meat + " ," + cheese + " ," + green);
        return BurgerWithoutMayonnaise;
    }
}
