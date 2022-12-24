package com.hillel.ahieiev.homework.homework18;

public class Array {
    public static double seredArif(int[] a) {
        double average = 0;
        if (a.length > 0) {
            double sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += a[j];
            }
            average = sum / a.length;
        }
        return average;
    }

    public static boolean matrixArray(int[][] a) {
        int rows = a.length;
        int columns = a[0].length;
        if (rows == columns) {
            return true;
        } else {
            return false;
        }
    }
}



