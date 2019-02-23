package com.bvan.javastart.lessons3_4.types;

/**
 * @author bvanchuhov
 */
public class DoubleExample {

    public static void main(String[] args) {
        double d = 10.5; // 8B - default
        float f = 10.5f; // 4B

        System.out.println(10.0 / 4); // 2.5
        System.out.println(0.5 / 4); // 0.125

        //-------

        double bigDouble = 12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789.0;
        System.out.println(bigDouble); // 1.2345678901234568E298
        // 17-18 digits

        //-------

        System.out.println(0.1 + 0.2); // 0.30000000000000004
        System.out.println(0.3 - 0.1); // 0.19999999999999998
        System.out.println(0.5 + 0.2);

        //-------

        double x = 10.7876567876;
        System.out.println(String.format("%.3f", x));
    }
}
