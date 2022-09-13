package com.hillel.khakhaliev.homeworks.homework5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String team1;
        String team2;

        //All Players
        final int AllPlayers = 5;

        //TEAM 1

        int G1T1 = 0;
        int G2T1 = 0;
        int G3T1 = 0;
        int G4T1 = 0;
        int G5T1 = 0;

        //TEAM 2

        int G1T2 = 0;
        int G2T2 = 0;
        int G3T2 = 0;
        int G4T2 = 0;
        int G5T2 = 0;

                        //TEAM 1

        System.out.print("Enter name for Team 1: ");

        team1 = scanner.nextLine();
        System.out.println("Team " + team1 + " ready to play");

        System.out.print("Enter frags " + team1 + " team for Player 1: ");


            //Player 1
        if (scanner.hasNextInt()) {
            G1T1 = scanner.nextInt();
            System.out.println( team1 + " Team," + " Frags from Player 1: " +G1T1 );
        }   else {
            System.out.println("You did something wrong, try again!");
            System.exit(0);
        }
        System.out.println();

        System.out.print("Enter frags " + team1 + " team for Player 2: ");

            //Player 2
        if (scanner.hasNextInt()) {
            G2T1 = scanner.nextInt();
            System.out.println( team1 + " Team," + " Frags from Player 2: " +G2T1 );
        }   else {
            System.out.println("You did something wrong, try again!");
            System.exit(0);
        }
        System.out.println();

        System.out.print("Enter frags " + team1 + " team for Player 3: ");

            //Player 3
        if (scanner.hasNextInt()) {
            G3T1 = scanner.nextInt();
            System.out.println( team1 + " Team," + " Frags from Player 3: " +G3T1 );
        }   else {
            System.out.println("You did something wrong, try again!");
            System.exit(0);
        }
        System.out.println();

        System.out.print("Enter frags " + team1 + " team for Player 4: ");

            //Player 4
        if (scanner.hasNextInt()) {
            G4T1 = scanner.nextInt();
            System.out.println( team1 + " Team," + " Frags from Player 4: " +G4T1 );
        }   else {
            System.out.println("You did something wrong, try again!");
            System.exit(0);
        }
        System.out.println();

        System.out.print("Enter frags " + team1 + " team for Player 5: ");

            //Player 5
        if (scanner.hasNextInt()) {
            G5T1 = scanner.nextInt();
            System.out.println( team1 + " Team," + " Frags from Player 5: " +G5T1 );
        }   else {
            System.out.println("You did something wrong, try again!");
            System.exit(0);
        }
        scanner.nextLine();
        System.out.println();




                        //TEAM 2

        System.out.print("Enter name for Team 2: ");

        team2 = scanner.nextLine();
        System.out.println("Team " + team2 + " ready to play");

        System.out.print("Enter frags " + team2 + " team for Player 1: ");


        //Player 1
        if (scanner.hasNextInt()) {
            G1T2 = scanner.nextInt();
            System.out.println( team2 + " Team," + " Frags from Player 1: " +G1T2 );
        }   else {
            System.out.println("You did something wrong, try again!");
            System.exit(0);
        }
        System.out.println();

        System.out.print("Enter frags " + team2 + " team for Player 2: ");

        //Player 2
        if (scanner.hasNextInt()) {
            G2T2 = scanner.nextInt();
            System.out.println( team2 + " Team," + " Frags from Player 2: " +G2T2 );
        }   else {
            System.out.println("You did something wrong, try again!");
            System.exit(0);
        }
        System.out.println();

        System.out.print("Enter frags " + team2 + " team for Player 3: ");

        //Player 3
        if (scanner.hasNextInt()) {
            G3T2 = scanner.nextInt();
            System.out.println( team2 + " Team," + " Frags from Player 3: " +G3T2 );
        }   else {
            System.out.println("You did something wrong, try again!");
            System.exit(0);
        }
        System.out.println();

        System.out.print("Enter frags " + team2 + " team for Player 4: ");

        //Player 4
        if (scanner.hasNextInt()) {
            G4T2 = scanner.nextInt();
            System.out.println( team2 + " Team," + " Frags from Player 4: " +G4T2 );
        }   else {
            System.out.println("You did something wrong, try again!");
            System.exit(0);
        }
        System.out.println();

        System.out.print("Enter frags " + team2 + " team for Player 5: ");

        //Player 5
        if (scanner.hasNextInt()) {
            G5T2 = scanner.nextInt();
            System.out.println( team2 + " Team," + " Frags from Player 5: " +G5T2 );
        }   else {
            System.out.println("You did something wrong, try again!");
            System.exit(0);
        }
        scanner.nextLine();
        System.out.println();

                        //RESULT

        double ResultTeam1 = G1T1 + G2T1 + G3T1 + G4T1 + G5T1;
        double ResultTeam2 = G1T2 + G2T2 + G3T2 + G4T2 + G5T2;

                        //SCORE

        double ScoreTeam1 = ResultTeam1 / AllPlayers;
        double ScoreTeam2 = ResultTeam2 / AllPlayers;

                        //WINNER

        if (ScoreTeam1 > ScoreTeam2){
            System.out.println(team1 + " WON!!!");
        } else if (ScoreTeam1 == ScoreTeam2) {
            System.out.println("Draw, they tried... ( ");
        }else {
            System.out.println(team2 + " WON!!!");
        }



    }
}
