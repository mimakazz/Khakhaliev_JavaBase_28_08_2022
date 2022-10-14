package com.hillel.khakhaliev.homeworks.homework14;

public class Androids implements Smartphones,LinuxOS{

    @Override
    public void Linux() {
        System.out.println("Android Linux - 2.5");
    }

    @Override
    public void call() {
        System.out.println("Android call");
    }

    @Override
    public void sms() {
        System.out.println("Android sms");
    }

    @Override
    public void internet() {
        System.out.println("Android internet");
    }
}
