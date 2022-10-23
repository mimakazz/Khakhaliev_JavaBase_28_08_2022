package com.hillel.khakhaliev.homeworks.homework16;

public class Main {
    public static double Array(int[] arr) {

        if (arr == null) return -2;
        else {
            double secondary = 0;
            for (int j : arr) {
                secondary += j;
            }
            return secondary / arr.length;
        }
    }
    public static int DoubleArray(int[][] arr) {
        if (arr == null) return -2;
        else {
            for (int[] ints : arr) {
                if (ints.length == arr.length) return 1;
            }

            return 0;
        }
    }
}
