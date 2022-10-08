package com.hillel.khakhaliev.homeworks.homework11;

public class Burger {
    String bap;
    String meat;
    String cheese;
    String green;
    boolean mayonnaise;

    public Burger(String bap, String meat, String cheese, String green, boolean mayonnaise) {
        this.bap = bap;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
    }


    public static String createBurger(String bap,String meat,String cheese,String green,String mayonnaise ){
        String normalBurger = new String("normal burger is " + bap + ", " + meat + ", " + cheese + ", " + green + ", " + mayonnaise);
        return normalBurger;
    }
}
