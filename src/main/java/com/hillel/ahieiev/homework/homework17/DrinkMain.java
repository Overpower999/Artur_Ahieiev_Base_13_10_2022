package com.hillel.ahieiev.homework.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class DrinkMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Drinks drinks = new Drinks();
        boolean a = true;

        while (a) {
            System.out.println("Выберите напиток: ");
            System.out.println(Arrays.toString(DrinksMachine.values()));
            String choice = sc.nextLine();
            choice = choice.toUpperCase();

            try {
                DrinksMachine drinksMachine = DrinksMachine.valueOf(choice);
                switch (drinksMachine) {
                    case COFFEE:
                        drinks.coffeePrepare();
                        break;
                    case TEA:
                        drinks.teaPrepare();
                        break;
                    case LEMONADE:
                        drinks.lemonadePrepare();
                        break;
                    case MOJITO:
                        drinks.mojitoPrepare();
                        break;
                    case SODA:
                        drinks.sodaPrepare();
                        break;
                    case COCA_COLA:
                        drinks.colaPrepare();
                        break;
                    default:
                        System.out.println("ERROR");
                        continue;
                }
            } catch (RuntimeException e) {
                System.out.println("\n" + "Введите правильное название продукта" + "\n");
                continue;
            }

            System.out.println("Желаете чего-нибудь еще? ДА/НЕТ");

            boolean moreDrinks = true;

            while (moreDrinks) {
                String answer = sc.nextLine();
                if (answer.equals("НЕТ") || answer.equals("Нет") || answer.equals("нет")) {
                    moreDrinks = false;
                    a = false;
                    System.out.println("Ваша сума к оплате: " + Drinks.cheak + "₴");
                } else if (answer.equals("Да") || answer.equals("ДА") || answer.equals("да")) {
                    moreDrinks = false;
                } else {
                    System.out.println("Ответьте - ДА/НЕТ");
                }
            }
        }
    }
}
