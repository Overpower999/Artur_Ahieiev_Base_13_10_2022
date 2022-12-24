package com.hillel.ahieiev.homework.homework18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {
    @Test
    public void test1() {
        int[] array3 = {2, 3, 4, 5, 6, 7};
        double test = Array.seredArif(array3);
        Assertions.assertEquals(4.5, test);
    }

    @Test
    public void test2() {
        int[][] matrix = new int[5][5];
        boolean test = Array.matrixArray(matrix);
        Assertions.assertEquals(true, test);
    }


}
