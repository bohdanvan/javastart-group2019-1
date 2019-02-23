package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class IndexOutOfBoundsExample {

    public static void main(String[] args) {
        int[] array = new int[10];

        array[9] = 100;

        System.out.println(Arrays.toString(array));
    }
}
