package com.hillel.ahieiev.homework.homework15;

public class Android implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Call");
    }

    @Override
    public void sms() {
        System.out.println("Sms");
    }

    @Override
    public void internet() {
        System.out.println("Internet");
    }

    @Override
    public void os() {
        LinuxOS.super.os();
    }
}
