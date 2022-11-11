package com.hillel.ahieiev.homework.homework9;

import java.util.Arrays;

public class Regbi {
    public static void main(String[] args) {

        //Є дві команди регбі з 25 гравців різного віку у кожній.
        //Вік беремо випадковим чином в діапазоні від 18 до 40.
        //Виведіть у двох рядках вік гравців кожної команди.
        // Порахуйте середній вік гравців кожної команди та виведіть на екран.

        int[] teamOne = new int[25];
        int[] teamTwo = new int[25];
        double sumOne = 0;
        double sumTwo = 0;

        for (int i = 0; i < teamOne.length; i++) {
            teamOne[i] = (int) ((Math.random() * 23) + 18);
            sumOne += teamOne[i];
        }

        for (int i = 0; i < teamTwo.length; i++) {
            teamTwo[i] = (int) ((Math.random() * 23) + 18);
            sumTwo += teamTwo[i];
        }

        System.out.println("Возвраст игроков первой команды:  " + Arrays.toString(teamOne));
        System.out.println("Возвраст игроков второй команды:  " + Arrays.toString(teamTwo));

        System.out.println();

        System.out.println("Срединй возвраст игрока первой команды: "+sumOne / teamOne.length);
        System.out.println("Срединй возвраст игрока второй команды: "+sumTwo / teamTwo.length);

    }
}
