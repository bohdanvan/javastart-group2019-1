package com.bvan.javastart.lessons5_6.multiloop;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 4;

        // Triangle printer (Rows)
        for (int length = 1; length <= size; length++) {

            // Line printer (Stars in a row)
            for (int n = 1; n <= length; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
