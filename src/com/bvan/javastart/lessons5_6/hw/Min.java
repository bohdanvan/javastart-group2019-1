package com.bvan.javastart.lessons5_6.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Min {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scan.nextInt();

        System.out.print("Enter b: ");
        int b = scan.nextInt();

        int min = (a < b) ? a : b;
//        int min;
//        if (a < b) {
//            min = a;
//        } else {
//            min = b;
//        }

        System.out.println("min = " + min);
    }
}

// Output
// a = 10, b = 20, min = 10
// a = 10, b = 5, min = 5
// a = 10, b = 10, min = 10
