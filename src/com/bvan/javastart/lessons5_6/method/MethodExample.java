package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    public static void main(String[] args) {
        int x = min(10, 20);
        int y = min(40, 30);
        System.out.println(x + y);
    }

    public static int min(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

//    public static String personInfo(String name, int age) { ... }

//    public static String[] findNamesStartedByA(String[] names) { ... }

//    public static double maxRating(double[] ratings) { ... }
}

// Method signature:
// * result type - int
// * name - min
// * types and names of args - int a, int b
