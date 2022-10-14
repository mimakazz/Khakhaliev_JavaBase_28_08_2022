package com.hillel.khakhaliev.homeworks.homework14;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        IPhones iPhones = new IPhones();

        System.out.println("-----iPhone-----");
        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.IOS();

        System.out.println("-----Android-----");
        androids.call();
        androids.sms();
        androids.internet();
        androids.Linux();
    }
}
