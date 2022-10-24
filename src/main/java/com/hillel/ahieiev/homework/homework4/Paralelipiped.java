package com.hillel.ahieiev.homework.homework4;

public class Paralelipiped {
    public static void main(String[] args) {
        double a = 34.4;
        double b = 10.3;
        double c = 7.9;
        int facets = 4;
        double volume = a * b * c;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        double length = (a * facets) + (b * facets) + (c * facets);
        System.out.println("Cумарнa довжинa всіх сторін = " + length);


    }
}
