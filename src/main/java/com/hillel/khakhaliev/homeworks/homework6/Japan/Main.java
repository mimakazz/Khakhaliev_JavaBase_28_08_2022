package com.hillel.khakhaliev.homeworks.homework6.Japan;

import java.util.Scanner;

public class Main {
    private static boolean Num (int num1){
        int num = num1 % 10;
        do {
            if (num == 4 || num == 9)
                return false;
            num1 /= 10;
            num = num1 % 10;
        } while (num1 > 0);
        return true;
    }
    public static void main(String[] args) {
        System.out.print("enter number of shuttles : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int count1 = 1;
        while (count < n) {
            if (Num(count1)) {
                System.out.println(count1);
                count++;
            }
            count1++;
        }
        System.out.println("ur shuttle numbers are on the list.  ");
        System.out.println("counter shuttles - " + count);

    }



}

