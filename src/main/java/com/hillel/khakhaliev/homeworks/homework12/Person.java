package com.hillel.khakhaliev.homeworks.homework12;

public class Person {
    private final String name;
    private final int day,month,year;
    private final String email;
    private final  String phoneNumber;

    private String lastName;
    private int weight,steps,squeeze;
    private int age;

    //constructor

    public Person(String name, int day, int month,
                  int year, String email, String phoneNumber,
                  String lastName, int weight, int steps, int squeeze) {

        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
        this.weight = weight;
        this.steps = steps;
        this.squeeze = squeeze;
        this.age = 2020 - year;
    }

    //getters

    public String getName() {
        return this.name;
    }
    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public int getAge() {
        return this.age;
    }

    //setters

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setSqueeze(int squeeze) {
        this.squeeze = squeeze;
    }

    public void printAccountInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Person: " +
                "name - " + this.name + '\n' +
                "lastName - " + this.lastName + '\n' +
                "squeeze - " + this.squeeze + '\n' +
                "email - " + this.email + '\n' +
                "phoneNumber - " + this.phoneNumber + '\n' +
                "day - " + this.day +'\n' +
                "month - " + this.month +'\n'+
                "year - " + this.year +'\n' +
                "weight = " + this.weight +'\n' +
                "steps = " + this.steps +'\n'+
                "age = " + this.age + "\n";
    }
}

