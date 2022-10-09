package com.hillel.khakhaliev.homeworks.homework12;

public class Main {
    public static void main(String[] args) {

        new Person("James", 2, 12, 1990, "james@email.com", "+12345678", "Jenkins", 60, 91, 14321).printAccountInfo();
        new Person("Jane", 12, 2, 1993, "jane@email.com", "+87654321", "Goldfish", 50, 80, 8123).printAccountInfo();
        new Person("Kosta", 22, 12, 2005, "kosta@email.com", "+380765654321", "Minikil", 67, 1000, 11793).printAccountInfo();
        new Person("Vita", 8, 8, 1999, "vita1999@email.com", "+4877693", "Krarkowa", 58, 2038, 2123).printAccountInfo();
        new Person("Anton", 1, 12, 2003, "ggnton@email.com", "+88005553535", "Minikuperow", 90, 80, 3740).printAccountInfo();

        Person Bob = new Person("Bob", 1, 1, 2002, "bob@email.com", "911", "Hudson", 90, 94, 1010);

        System.out.println("After changes: \n");
        Bob.printAccountInfo();
        Bob.setLastName("Goldfish");
        Bob.setWeight(70);
        Bob.setSqueeze(120);
        Bob.setSteps(11223);
        Bob.printAccountInfo();
    }
}
