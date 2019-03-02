package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class HWAnalyze {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isAge(int n) {
//        if (n >= 1 && n <= 120) {
//            return true;
//        } else {
//            return false;
//        }
        return n >= 1 && n <= 120;
    }

    public static char lastChar(String s) {
        return s.charAt(s.length() - 1);
    }

    public static int rangeSum(int from, int to) { // 10, 20
        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }
}
