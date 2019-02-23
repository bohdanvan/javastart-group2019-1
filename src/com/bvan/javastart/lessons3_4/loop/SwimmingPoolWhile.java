package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class SwimmingPoolWhile {

    public static void main(String[] args) {
        int day = 1; // 1. initial value

        while (day <= 5) { // 2. loop condition
            System.out.println(day + ": Swimming Pool");
            day++; // 3. counter changing
        }

        System.out.println("Friends");
    }
}
