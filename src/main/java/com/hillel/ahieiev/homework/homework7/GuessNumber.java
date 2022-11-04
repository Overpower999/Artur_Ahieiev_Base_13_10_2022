package com.hillel.ahieiev.homework.homework7;

import java.util.Scanner;

public class GuessNumber {

    //Сделать игру, в которой нужно угадать целое число, которое "загадал" компьютер в диапазоне от 0 до 10
    //Пользователь должен иметь возможность угадывать несколько попыток (минимум 3).
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 11);
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        System.out.println("Компьютер загадал число от 0 до 10, у тебя есть 3 попытки что бы его отгадать)");
        System.out.println();
        System.out.println("Поехали!!!");

        while (true) {
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                a++;

                if (b == randomNumber) {
                    System.out.println("Поздравляю вы выиграли!!!");
                    break;
                } else if (a == 3) {
                    System.out.println("Вы проиграли(");
                    break;
                } else {
                    System.out.println("Попробуйте еще раз");
                    scanner.nextLine();
                    continue;
                }
            } else {
                System.out.println("Вы ввели не целочисленое значение, попробуйте снова");
                scanner.nextLine();
                continue;
            }
        }

    }
}
