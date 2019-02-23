package com.bvan.javastart.lessons5_6.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DayTypeV2 {

    public static void main(String[] args) {
        // Input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scan.nextInt();

        // BL
        String dayType;
        if (day <= 5) {
            dayType = "weekday";
        } else {
            dayType = "weekend";
        }

        // Output
        System.out.println(dayType);
    }
}
