package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class NullReference {

    public static void main(String[] args) {
        String[] names = {"Boris", "Oleh"};
        String s = findNameWithA(names);
        if (s == null) {
            System.out.println("Sorry, not found");
        } else {
            System.out.println(s.length());
        }
    }

    /**
     *
     * @param names
     * @return name with 'a' or null if not found.
     */
    public static String findNameWithA(String[] names) {
        for (String name : names) {
            if (name.contains("a")) {
                return name;
            }
        }
        return null;
    }
}
