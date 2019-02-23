package com.bvan.javastart.lessons5_6.hw;

/**
 * @author bvanchuhov
 */
public class Min3 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;

        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;

        System.out.println("min = " + min);
    }
}
