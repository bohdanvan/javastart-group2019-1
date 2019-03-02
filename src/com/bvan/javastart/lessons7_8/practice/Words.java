package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class Words {

    public static void main(String[] args) {
        String[] words = {"Hello", "Java", "!"}; // Ctrl + Alt + V
        int totalLength = totalLength(words);
        System.out.println(totalLength); // 10

        boolean b = containsEmptyWord(words);
        System.out.println(b); // false
    }

    public static boolean containsEmptyWord(String[] words) {
        for (String word : words) {
            if (word.isEmpty()) {
                return true;
            }
        }

        return false;
    }

    public static int totalLength(String[] words) {
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            int length = word.length();
//            totalLength += length;
//        }
        return totalLength;
    }

}
