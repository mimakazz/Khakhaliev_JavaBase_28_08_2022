package com.hillel.khakhaliev.homeworks.homework7;

public class Main {
    public static void main(String[] args) {
      int[] Team1 = new int[25];
      int[] Team2 = new int[25];

      int age;

      int max = 40;
      int min = 18;

      final int Gamers = 25;

      int SumAgeTeam1 = 0;
      int SumAgeTeam2 = 0;


        for (int i = 0; i < Team1.length; i++) {
            age = min + (int) (Math.random() * (max - min));
            SumAgeTeam1 += age++;

            System.out.println("gamer " + (i + 1) + " team 1 - " + "age " + age);

        }
        System.out.println();

        System.out.println("Sum age team 1: " + SumAgeTeam1 / Gamers + " lat");

        System.out.println();

        for (int i = 0; i < Team2.length; i++) {
            age = min + (int) (Math.random() * (max - min));
            SumAgeTeam2 += age++;

            System.out.println("gamer " + (i + 1) + " team 2 - " + "age " + age);

        }
        System.out.println();

        System.out.println("Sum age team 2: " + SumAgeTeam2 / Gamers + " lat");

    }
}
