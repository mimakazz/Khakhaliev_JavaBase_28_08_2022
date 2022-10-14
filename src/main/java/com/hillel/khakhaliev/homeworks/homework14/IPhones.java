package com.hillel.khakhaliev.homeworks.homework14;

public class IPhones implements IOS,Smartphones{
    @Override
    public void IOS() {
        System.out.println("IPhone IOS - 1.7");
    }

    @Override
    public void call() {
        System.out.println("IPhone call");
    }

    @Override
    public void sms() {
        System.out.println("IPhone sms");
    }

    @Override
    public void internet() {
        System.out.println("IPhone internet");
    }
}
