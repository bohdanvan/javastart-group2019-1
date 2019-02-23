package com.bvan.javastart.lessons5_6.array;

/**
 * @author bvanchuhov
 */
public class ArrayPrinter {

    public static void main(String[] args) {
        int[] array = {10, 30, 20, 15};

        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            System.out.println(elem);
        }
        System.out.println();

        // For-each Loop (READ ONLY)
        for (int elem : array) {
            System.out.println(elem);
        }
    }
}
