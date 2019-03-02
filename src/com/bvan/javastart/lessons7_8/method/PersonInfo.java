package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class PersonInfo {

    public static void main(String[] args) {
        System.out.println(personInfo("Boris", 500));
        System.out.println(personInfo("Anna", 20));
    }

    public static String personInfo(String name, int age) {
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("illegal age");
        }
        return "Hello, I'm " + name + ", "
                + age + " years old";
    }
}
