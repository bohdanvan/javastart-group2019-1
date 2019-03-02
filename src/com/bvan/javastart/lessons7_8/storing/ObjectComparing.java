package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class ObjectComparing {

    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println("Ref: " + (s1 == s2)); // DO NOT USE FOR OBJECT COMPARING
        System.out.println("Content: " + s1.equals(s2));
    }
}
