package com.hillel.ahieiev.homework.homework11;

import java.util.Scanner;

public class Transposition {
    public static void main(String[] args) {
        //Транспонируйте матрицу M x N. Размеры M и N задаются из консоли.
        //После ввода должны автоматически создаваться два массива размером M x N первый и N x M второй.

        System.out.println("Введите два целочисленых значения что бы создать матрицу. ");
        System.out.println();

        int n = 0;
        int m = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое значение : ");

        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                break;
            } else {
                System.out.println("Введено нецелочисленное значение");
                scanner.nextLine();
                continue;
            }
        }

        System.out.println("Введите второе значение : ");
        scanner.nextLine();

        while (true) {
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                break;
            } else {
                scanner.nextLine();
                System.out.println("Введено нецелочисленное значение");
                continue;
            }
        }

        int[][] a = new int[n][m];
        int[][] b = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = n * i + j;
            }
        }

        System.out.println();

        System.out.println("Начальная матрица");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }


        System.out.println("Новая матрица");
        System.out.println("------");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}



