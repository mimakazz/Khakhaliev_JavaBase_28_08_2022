package com.hillel.khakhaliev.homeworks.homework15;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        Scanner scanner = new Scanner(System.in);
        DrinksMachine[] drinksMachines = DrinksMachine.values();
        int totalPrice = 0, counter = 0;
        while (true) {
            DrinksMachine drinksMachine = null;
            System.out.println("Please enter your drink:" + Arrays.toString(drinksMachines) + " or write NO to end the process");
            while (true) {
                String userValue = scanner.nextLine().toUpperCase();
                if (userValue.equals("NO")) {
                    System.out.println("The total cost: " + totalPrice);
                    System.out.println("Total number of manufactured drinks: " + counter);
                    System.exit(0);
                }
                for (DrinksMachine drink : drinksMachines) {
                    if (userValue.equals(drink.toString())) {
                        drinksMachine = DrinksMachine.valueOf(userValue);
                        break;
                    }
                }
                if (drinksMachine != null) {
                    break;
                } else {
                    System.out.println("Wrong data");
                }
            }
            switch (drinksMachine) {
                case COFFEE -> {
                    System.out.println("ur " + DrinksMachine.COFFEE.getTitle() + " ready, its cost " + Drinks.COFFEE);
                    totalPrice += Drinks.COFFEE;
                    counter++;
                }
                case TEA -> {
                    System.out.println("ur " + DrinksMachine.TEA.getTitle() + " ready, its cost " + Drinks.TEA);
                    totalPrice += Drinks.TEA;
                    counter++;
                }
                case LEMONADE -> {
                    System.out.println("ur " + DrinksMachine.LEMONADE.getTitle() + " ready, its cost " + Drinks.LEMONADE);
                    totalPrice += Drinks.LEMONADE;
                    counter++;
                }
                case MOJITO -> {
                    System.out.println("ur " + DrinksMachine.MOJITO.getTitle() + " ready, its cost " + Drinks.MOJITO);
                    totalPrice += Drinks.MOJITO;
                    counter++;
                }
                case MINERAL -> {
                    System.out.println("ur " + DrinksMachine.MINERAL.getTitle() + " ready, its cost " + Drinks.MINERAL);
                    totalPrice += Drinks.MINERAL;
                    counter++;
                }

                case COCA_COLA -> {
                    System.out.println("ur " + DrinksMachine.COCA_COLA.getTitle() + " ready, its cost " + Drinks.COCA_COLA);
                    totalPrice += Drinks.COCA_COLA;
                    counter++;
                }
            }
        }
    }
}