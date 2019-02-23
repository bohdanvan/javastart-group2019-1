package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayFiller {

    public static void main(String[] args) {
        // 1. Create an array with size 5 +
        // 2. Fill the array: [1, 1, 1, 1, 1]
        // 3. Print the array

        int[] array = new int[5];

        int filler = 42;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }

        System.out.println(Arrays.toString(array));
    }
}
