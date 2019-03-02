package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class SumMethod {

    public static void main(String[] args) {
        int x = sum(10, 40);
        int y = sum(200, sum(60, 20));
        System.out.println(x);
        System.out.println(y);
    }

    public static int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    // public static <res-type> <name>(<types-and-names-of-args>) { ... }
}

