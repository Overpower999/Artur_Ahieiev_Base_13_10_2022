package com.hillel.ahieiev.homework.homework6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        //
        final String error = "Введено неверное значение, попробуйте ещё раз!";
        //
        int playerOne1 = 0;
        int playerOne2 = 0;
        int playerOne3 = 0;
        int playerOne4 = 0;
        int playerOne5 = 0;
        //
        int playerTwo1 = 0;
        int playerTwo2 = 0;
        int playerTwo3 = 0;
        int playerTwo4 = 0;
        int playerTwo5 = 0;
        //
        String comandName1 = null;
        String comandName2 = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в Counter Strike 1.6");
        System.out.println();
        System.out.print("Введите название первой команды : ");

        if (scanner.hasNextLine()) {
            comandName1 = scanner.nextLine();
            System.out.println("Первая команда : " + comandName1);
            System.out.println();
        } else {
            System.out.println(error);
            System.exit(0);
        }

        System.out.println("Введите количество фрагов для каждого из игроков первой команды (Игроков 5) ");
        System.out.println();


        System.out.print("Игрок 1 : ");
        if (scanner.hasNextInt()) {
            playerOne1 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }


        System.out.print("Игрок 2 : ");
        if (scanner.hasNextInt()) {
            playerOne2 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }


        System.out.print("Игрок 3 : ");
        if (scanner.hasNextInt()) {
            playerOne3 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }


        System.out.print("Игрок 4 : ");
        if (scanner.hasNextInt()) {
            playerOne4 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }


        System.out.print("Игрок 5 : ");
        if (scanner.hasNextInt()) {
            playerOne5 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }


        System.out.println();
        scanner.nextLine();
        System.out.print("Введите название второй команды : ");


        if (scanner.hasNextLine()) {
            comandName2 = scanner.nextLine();
            System.out.println("Вторая команда : " + comandName2);
            System.out.println();
        } else {
            System.out.println(error);
            System.exit(0);
        }

        System.out.println("Введите количество фрагов для каждого из игроков второй команды (Игроков 5) ");
        System.out.println();

        System.out.print("Игрок 1 : ");
        if (scanner.hasNextInt()) {
            playerTwo1 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }


        System.out.print("Игрок 2 : ");
        if (scanner.hasNextInt()) {
            playerTwo2 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }


        System.out.print("Игрок 3 : ");
        if (scanner.hasNextInt()) {
            playerTwo3 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }


        System.out.print("Игрок 4 : ");
        if (scanner.hasNextInt()) {
            playerTwo4 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }


        System.out.print("Игрок 5 : ");
        if (scanner.hasNextInt()) {
            playerTwo5 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }


        int scoreComandOne = (playerOne1 + playerOne2 + playerOne3 + playerOne4 + playerOne5) / 5;
        int scoreComandTwo = (playerTwo1 + playerTwo2 + playerTwo3 + playerTwo4 + playerTwo5) / 5;

        System.out.println();

        if (scoreComandOne > scoreComandTwo) {
            System.out.println("Победившая команда " + comandName1 + " набрала " + scoreComandOne + " очков");
        } else if (scoreComandOne < scoreComandTwo) {
            System.out.println("Победившая команда " + comandName2 + " набрала " + scoreComandTwo + " очков");
        } else {
            System.out.println("Победила ничья!!!!");
        }


    }
}
