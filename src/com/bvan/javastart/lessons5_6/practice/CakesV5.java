package com.bvan.javastart.lessons5_6.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class CakesV5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of cakes: ");
        int cakes = scanner.nextInt();

        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();

        // People Loop
        for (int person = 1; person <= people; person++) {
            System.out.println("I'm " + person + " person."
                    + " I have " + cakes + " cakes.");

            // Cakes Loop
            for (int cake = 1; cake <= cakes; cake++) {
                System.out.println("I'm " + person + " person. "
                        + "I have eaten " + cake + " cake.");
            }

            System.out.println();
        }
    }
}
