package com.hillel.ahieiev.homework.homework17;

import java.util.Scanner;

public class Drinks {
    public static final int COFFEE_PRICE = 40;
    public static final int TEA_PRICE = 30;
    public static final int LEMONADE_PRICE = 25;
    public static final int MOJITO_PRICE = 25;
    public static final int SODA_PRICE = 15;
    public static final int COCA_COLA_PRICE = 20;

    public static int cheak = 0;
    Scanner sc = new Scanner(System.in);

    public void coffeePrepare() {
        System.out.println("Чашка кофе стоит: " + COFFEE_PRICE + "₴");
        System.out.print("Введите количество чашек кофе: ");
        int score = sc.nextInt();
        cheak += COFFEE_PRICE * score;
    }

    public void teaPrepare() {
        System.out.println("Чашка чая стоит: " + TEA_PRICE + "₴");
        System.out.print("Введите количество чашек чая: ");
        int score = sc.nextInt();
        cheak += TEA_PRICE * score;
    }

    public void lemonadePrepare() {
        System.out.println("Стакан лимонада стоит: " + LEMONADE_PRICE + "₴");
        System.out.print("Введите количество стаканов лимонада: ");
        int score = sc.nextInt();
        cheak += LEMONADE_PRICE * score;
    }

    public void mojitoPrepare() {
        System.out.println("Стакан мохито стоит: " + MOJITO_PRICE + "₴");
        System.out.print("Введите количество стаканов мохито: ");
        int score = sc.nextInt();
        cheak += MOJITO_PRICE * score;
    }

    public void sodaPrepare() {
        System.out.println("Стакан минералки стоит: " + SODA_PRICE + "₴");
        System.out.print("Введите количество стаканов минералки: ");
        int score = sc.nextInt();
        cheak += SODA_PRICE * score;
    }

    public void colaPrepare() {
        System.out.println("Стакан Кока-Колы стоит: " + COCA_COLA_PRICE + "₴");
        System.out.print("Введите количество стаканов Кока-Колы: ");
        int score = sc.nextInt();
        cheak += COFFEE_PRICE * score;
    }
}