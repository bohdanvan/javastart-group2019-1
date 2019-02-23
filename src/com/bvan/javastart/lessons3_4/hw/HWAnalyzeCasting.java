package com.bvan.javastart.lessons3_4.hw;

/**
 * @author bvanchuhov
 */
public class HWAnalyzeCasting {

    public static void main(String[] args) {
        int a = 2_000_000_000;
        long b = 1_000_000_000L;
        long c = a + b;
        System.out.println(c);

        System.out.println(2_000_000_000L + 1_000_000_000L);
    }
}
