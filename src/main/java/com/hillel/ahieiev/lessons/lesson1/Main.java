package com.hillel.ahieiev.lessons.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("Строка введена: " + a);
    }
}
