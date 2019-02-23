package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class CelsiusToFahrenheitConverter {

    public static void main(String[] args) {
        System.out.println(20 + " °C -> " + toFahrenheit(20) + " °F");
        System.out.println(0 + " °C -> " + toFahrenheit(0) + " °F");
        System.out.println(-10 + " °C -> " + toFahrenheit(-10) + " °F");
    }

    public static double toFahrenheit(double celsius) {
        return 1.8 * celsius + 32;
    }
}

// 20.0 °C -> 68.0 °F
// 0.0 °C -> 32.0 °F
// -10.0 °C -> 14.0 °F
