package com.hillel.ahieiev.homework.homework12;

public class Person {
    public static void main(String[] args) {

        System.out.println(personInfo("Will Smith", "Нью-Йорк", "2936729462846"));
        System.out.println(personInfo("Jackie Chan", "Шанхая", "12312412412"));
        System.out.println(personInfo("Sherlock Holmes", "London", "37742123513"));

    }

    static String personInfo(String name, String city, String telefon) {
        String info = "Позвонить гражданину " + name + " из города " + city + " можно по номеру " + telefon;
        return info;
    }
}
