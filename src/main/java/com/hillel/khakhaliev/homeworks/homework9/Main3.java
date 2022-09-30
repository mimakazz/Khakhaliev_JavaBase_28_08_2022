package com.hillel.khakhaliev.homeworks.homework9;

import java.util.Scanner;

public class Main3 {
    static int inputAndCheck(Scanner scanner){
        int temp = 0;
        while (true){
            if (scanner.hasNextInt()){
                temp = scanner.nextInt();
                if (temp < 0){
                    System.out.println("Enter positive number!");
                }else {
                    break;
                }
                scanner.nextLine();
            }else {
                System.out.println("Wrong data, try again!");
                scanner.nextLine();
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //ROWS
        System.out.print("Enter array rows: ");
        int m = inputAndCheck(scanner);
        System.out.print( m + " - your array rows");

        System.out.println();
        System.out.println();
        //COLUMNS
        System.out.print("Enter array columns: ");
        int n = inputAndCheck(scanner);
        System.out.println(n + " - your array columns");

        System.out.println();

        System.out.print("Enter max numbers: ");
        int max = scanner.nextInt();


        int [][] array1 = new int[m][];
        int [][] array2 = new int[n][];

        for (int i = 0; i < array2.length; i++)
            array2[i] = new int[m];

        System.out.println("-----BEFORE-----");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = new int[n];
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = ((int) (Math.random() * max));
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
             System.out.println();
             System.out.println();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }
        System.out.println("-----AFTER-----");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }


    }
}






