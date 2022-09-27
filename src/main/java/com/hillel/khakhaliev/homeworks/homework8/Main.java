package com.hillel.khakhaliev.homeworks.homework8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] LotteryNum = new int[7];
        int[] playersNum = new int[7];
        int min = 0;
        int max = 9;


        System.out.println("lottery num: ");

        for (int i = 0; i < LotteryNum.length; i++) {
            LotteryNum[i] = min + (int) (Math.random() * (max - min) + 1);
        }

        Arrays.sort(LotteryNum);

        for (int i = 0; i < LotteryNum.length; i++) {
            if (i == playersNum.length - 1) {

                System.out.print(LotteryNum[i]);
            } else {
                System.out.print(LotteryNum[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("player num: ");

        for (int j = 0; j < playersNum.length; j++) {
            playersNum[j] = min + (int) (Math.random() * ((max - min) + 1));
        }

        Arrays.sort(playersNum);

        for (int j = 0; j < playersNum.length; j++) {
            if (j == playersNum.length - 1) {
                System.out.print(playersNum[j]);

            } else {
                System.out.print(playersNum[j] + ", ");
            }
        }
        int count = 0;

        for (int i = 0; i < playersNum.length; i++) {
            if (LotteryNum[i] == playersNum[i]) {
                count++;

                int a = LotteryNum[i];
                int b = playersNum[i];
                if (a == b) {

                    System.out.println();
                    System.out.println("matching index: " + i);

                }
            }
        }

        System.out.println();
        System.out.print("all numbers matched = " + count);
    }
}
