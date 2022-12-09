package com.hillel.ahieiev.homework.homework15;

public class Main {
    public static void main(String[] args) {
        Iphones iphones5 = new Iphones();
        iphones5.call();
        iphones5.internet();
        iphones5.os();
        iphones5.sms();

        Smartphones iphones = new Iphones();
        iphones.call();
        iphones.internet();
        iphones.sms();

        Smartphones android = new Android();
        android.sms();
        android.call();
        android.internet();

        LinuxOS androidLin = new Android();
        androidLin.os();

        IOS iphonesOs = new Iphones();
        iphonesOs.os();

    }
}
