package com.bvan.javastart.lessons7_8.practice;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class Zebra {

    public static void main(String[] args) {
        String[] zebra1 = createZebra(10);
        System.out.println(Arrays.toString(zebra1));

        String[] zebra2 = createZebra(11);
        System.out.println(Arrays.toString(zebra2));
    }

    public static String[] createZebra(int size) {
        String[] zebra = new String[size];

        for (int i = 0; i < zebra.length; i++) {
            zebra[i] = (i % 2 == 0) ? "black" : "white";

//            if (i % 2 == 0) {
//                zebra[i] = "black";
//            } else {
//                zebra[i] = "white";
//            }
        }

        return zebra;
    }
}
