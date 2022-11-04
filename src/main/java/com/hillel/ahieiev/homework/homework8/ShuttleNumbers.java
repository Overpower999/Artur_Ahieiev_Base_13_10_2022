package com.hillel.ahieiev.homework.homework8;

public class ShuttleNumbers {
    public static void main(String[] args) {
        //В Японии числа 4 и 9 считаются несчастливыми.
        //Вам нужно пронумеровать 100 космических шаттлов для перевозки людей на Марс так,
        //чтобы в номерах шаттлов не случалось несчастливых чисел. Напишите функцию, выводящую все номера таких шаттлов.
        System.out.println("Идёт подготовка нумерования шатлов");
        System.out.println();
        System.out.println("Нумирация шатлов:");
        System.out.println();

        int countShatels = 0;
        for (int i = 1; ; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i / 100 == 4 || i / 100 == 9 || i % 10 == 4 || i % 10 == 9 || (i - 100) / 10 == 4) {
                continue;
            } else if (countShatels == 100) {
                break;
            }
            System.out.println("Номер шатла " + i);
            countShatels++;
        }
        System.out.println();
        System.out.println("Количество шатлов пронумировано: " + countShatels);
    }
}

