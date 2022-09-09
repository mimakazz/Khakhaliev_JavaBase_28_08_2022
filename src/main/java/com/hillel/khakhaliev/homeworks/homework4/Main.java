package com.hillel.khakhaliev.homeworks.homework4;

public class Main {
    public static void main(String[] args) {
            byte DynastyWarriorsLi = 13;
            byte DynastyArchersLi = 24;
            byte DynastyRidersLi = 46;

                byte DynastyWarriorsMin = 9;
                byte DynastyArchersMin = 35;
                byte DynastyRidersMin = 12;

            int WarriorsLi = DynastyWarriorsLi * 860;
            int ArchersLi = DynastyArchersLi * 860;
            int RidersLi = DynastyRidersLi * 860;

                int WarriorsMin = DynastyWarriorsMin * 1290;
                int ArchersMin = DynastyArchersMin * 1290;
                int RidersMin = DynastyRidersMin * 1290;

            System.out.println("Attack Li : " + WarriorsLi + ArchersLi + RidersLi + " Warriors");
            System.out.println();
            System.out.println("Attack Min : " + WarriorsMin + ArchersMin + RidersMin + " Warriors");
        }
    }

