package com.hillel.ahieiev.homework.homework10;

import java.util.Arrays;

public class Lotery {
    public static void main(String[] args) {

        //Сделать два массива из 7 цифр, заполненных случайными цифрами (от 0 до 9).
        //Первый массив – это числа, которые загаданы фирмой-организатором лотереи.
        //Второй массив – это числа, которые угадал игрок.
        //После того как оба массива заполнены цифрами, нужно отсортировать их по возрастанию любым способом.
        //В отсортированных массивах определить количество совпадений, то есть чисел в двух массивах с одинаковым индексом; Например:
        //first[3] должен быть равен second[3], как показано ниже.
        //Пример вывода в консоль (совпали 1й, 4й и 6й элементы):
        //[0, 1, 4, 5, 5, 8, 9]
        //[1, 1, 2, 3, 5, 6, 9]
        //Количество совпадений: 3

        int[] peopelTicket = new int[7];
        int[] loteryTicket = new int[7];

        for (int i = 0; i < peopelTicket.length; i++) {
            peopelTicket[i] = (int) (Math.random() * 10);
            loteryTicket[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(peopelTicket);
        Arrays.sort(loteryTicket);

        int counter = 0;

        for (int i = 0; i < peopelTicket.length; i++) {
            if (peopelTicket[i] == loteryTicket[i]) {
                System.out.println("Совпал ряд " + (i + 1) + "-й.");
                counter++;
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(peopelTicket));
        System.out.println(Arrays.toString(loteryTicket));
        System.out.println();
        System.out.println("Количевство совпадений: " + counter);

    }
}
