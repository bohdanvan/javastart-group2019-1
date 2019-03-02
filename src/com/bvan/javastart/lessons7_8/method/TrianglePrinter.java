package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        printTriangle(10);
        printTriangle(5);
//        printTriangle(-10);
    }

    public static void printTriangle(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("illegal size");
        }
        for (int length = 1; length <= size; length++) {
            printLine(length);
        }
    }

    public static void printLine(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("illegal length");
        }
        for (int n = 1; n <= length; n++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
