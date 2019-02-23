package com.bvan.javastart.lessons3_4.types;

/**
 * @author bvanchuhov
 */
public class CharExample {

    public static void main(String[] args) {
        String s = "Hello,\n Java!";
        System.out.println(s);

        char c1 = 'a'; // 2 B, Unicode
        char c2 = '\n'; // \n, \t, \\, \', \"

        // "D:\\Movies\movie.mkv"
        System.out.println("\"D:\\\\Movies\\movie.mkv\"");

        System.out.println("I \uD83D\uDDA4\uD83D\uDDA4\uD83D\uDDA4 Java. \uD83D\uDE00");

        System.out.println('\uD83D' * 3); // bad practice
    }
}
