package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class StringStoring3 {

    public static void main(String[] args) {
        String s = "Hello"; // immutable
        String s2= s.toUpperCase().substring(0, 2).toLowerCase(); // he
        System.out.println(s);
        System.out.println(s2);
    }
}
