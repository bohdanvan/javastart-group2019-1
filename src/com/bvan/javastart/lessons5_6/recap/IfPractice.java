package com.bvan.javastart.lessons5_6.recap;

/**
 * @author bvanchuhov
 */
public class IfPractice {

    public static void main(String[] args) {
        int x = 0;

        if (x < 0) {
            System.out.println("negative");
        } else {
            System.out.println("not negative");
            if (x == 0) {
                System.out.println("zero");
            } else {
                System.out.println("positive");
            }
        }

    }
}
