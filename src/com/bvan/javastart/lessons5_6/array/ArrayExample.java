package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] ratings = new int[5];
        double[] heights = new double[10];
        String[] names = {"Bohdan", "Ivan", "Masha"};

        int length = ratings.length;
        System.out.println(length);

        ratings[0] = 1;
        ratings[1] = 2;
        //...
        ratings[3] = 10;

        System.out.println(ratings[0] + ", " + ratings[1] + ", " + ratings[2] + ", " + ratings[3] + ", " + ratings[4]);

        String s = Arrays.toString(ratings);
        System.out.println(s);

        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(names));
    }
}
