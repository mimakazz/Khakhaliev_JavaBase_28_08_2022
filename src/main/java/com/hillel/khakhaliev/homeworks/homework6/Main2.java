package com.hillel.khakhaliev.homeworks.homework6;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("i guessed a number from 0 to 10");
        System.out.println("");
        System.out.println("u have 3 tries!");
        System.out.print("guess it: ");

        int randomNum = ((int) (Math.random() * 10 + 1));
        Scanner scanner = new Scanner(System.in);
        int guessNum = scanner.nextInt();

        if (guessNum < 0 || guessNum > 10){
            System.out.println("wrong range, use only Num from 0 - 10!!!");
            System.exit(0);
        }


        for (int count = 2; count > 0; --count) {

            if (guessNum < 0 || guessNum > 10) {

                System.out.println("wrong range! ");
                System.exit(0);
            }

            if (guessNum > randomNum) {

                System.out.println("ur number more, remaining attempts: " + count);
                guessNum = scanner.nextInt();

            } else if (guessNum < randomNum) {

                System.out.println("ur number less, remaining attempts: " + count);
                guessNum = scanner.nextInt();
            }

        }
        if (guessNum == randomNum) {
            System.out.println("u win! ");
        }

        if (guessNum > randomNum || guessNum < randomNum) {
            System.out.println("u loose! ");
        }


        }
    }

