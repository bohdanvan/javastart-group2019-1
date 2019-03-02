package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = a;

        b[0] = 1000;

        System.out.println(Arrays.toString(a)); // [10, 20, 30]
        System.out.println(Arrays.toString(b)); // [1000, 20, 30]
    }
}
