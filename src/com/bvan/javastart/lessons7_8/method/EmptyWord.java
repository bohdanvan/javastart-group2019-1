package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class EmptyWord {

    public static void main(String[] args) {
        String s = "";
        System.out.println(s.isEmpty());
        System.out.println(s.equals(""));

        String[] names = {"Ivan", "", "Boris"};
    }
}
