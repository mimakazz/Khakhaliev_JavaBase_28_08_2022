package com.hillel.khakhaliev.homeworks.homework11;

public class DoubleMeat extends Burger{
    boolean mayonnaise;
    boolean doubleMeat;

    public DoubleMeat(String bap, String meat, String cheese, String green, boolean mayonnaise,boolean doubleMeat) {
        super(bap, meat, cheese, green, mayonnaise);
        this.mayonnaise = true;
        this.doubleMeat = true;
    }
    public static String createBurger(String bap,String meat,String cheese,String green,boolean mayonnaise, boolean doubleMeat){
        String DoubleMeat = new String ("double burger is " + bap + " ,portion of " + meat + "x2 ," + cheese + " ," + green + ", mayonnaise");
        return DoubleMeat;
    }
}
