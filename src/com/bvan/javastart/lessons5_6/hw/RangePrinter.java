package com.bvan.javastart.lessons5_6.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class RangePrinter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter from: ");
        int from = scan.nextInt();

        System.out.print("Enter to: ");
        int to = scan.nextInt();

        for (int n = from; n <= to; n++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
