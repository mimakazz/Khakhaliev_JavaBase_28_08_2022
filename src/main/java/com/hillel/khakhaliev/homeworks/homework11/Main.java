package com.hillel.khakhaliev.homeworks.homework11;

public class Main {
    public static void main(String[] args) {
        System.out.println(Burger.createBurger("bun", "meat", "cheese", "greens", "mayonnaise"));
        System.out.println(BurgerWithoutMayonnaise.createBurger("bun", "meat", "cheese", "greens"));
        System.out.println(DoubleMeat.createBurger("bun", "meat", "cheese", "greens", true, true));
    }
}
