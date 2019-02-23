package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class YearsFiller {

    public static void main(String[] args) {
        // 1. Create an array
        // 2. Fill with the years 2000 ... 2019
        // 3. Print the array

        int[] years = new int[20];

        // fori + Enter
        for (int i = 0; i < years.length; i++) {
            years[i] = 2000 + i;
        }

        System.out.println(Arrays.toString(years));
    }
}
