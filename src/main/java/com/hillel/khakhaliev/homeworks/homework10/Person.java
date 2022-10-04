package com.hillel.khakhaliev.homeworks.homework10;

public class Person {
    public static String personInfo(String name,String surName,String city,String phoneNumber){
        String human = new String("call a citizen " + name + "" + surName + " from the city " + city + " by phone Number " + phoneNumber + ".");
        System.out.println(human);
        return human;
    }

    public static void main(String[] args) {
        personInfo("Will","Smith","New York","2936729462846");
        personInfo("Jackie","Chan","Shanghai","12312412412");
        personInfo("Sherlock","Holmes","London","37742123513");
    }
}
