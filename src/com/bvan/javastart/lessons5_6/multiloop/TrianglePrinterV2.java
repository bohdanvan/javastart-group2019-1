package com.bvan.javastart.lessons5_6.multiloop;

/**
 * @author bvanchuhov
 */
public class TrianglePrinterV2 {

    public static void main(String[] args) {
        int size = 4;

        for (int length = 1; length <= size; length++) {
            for (int n = 1; n <= length; n++) {
                System.out.print(length + " ");
            }
            System.out.println();
        }
    }
}
