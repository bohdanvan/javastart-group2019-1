package com.bvan.javastart.lessons7_8.method;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class YearsFiller {

    public static void main(String[] args) {
        int[] years = createYears(2010, 2015);
        System.out.println(Arrays.toString(years));
    }

    public static int[] createYears(int minYear, int maxYear) {
        if (minYear > maxYear) {
            throw new IllegalArgumentException("illegal years");
        }
        int size = maxYear - minYear + 1;
        int[] years = new int[size];
        for (int i = 0; i < years.length; i++) {
            years[i] = minYear + i;
        }
        return years;
    }
}
