package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class Geometry {

    public static void main(String[] args) {
        double a1 = rectangleArea(10, 20);
        System.out.println(a1); // 200

        System.out.println(rectangleArea(30, 40)); // 1200

        System.out.println(circleArea(10)); // 314
    }

    public static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException(
                    "illegal radius: " + radius);
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public static double rectangleArea(double width, double height) {
        if (width <= 0) {
            throw new IllegalArgumentException(
                    "illegal width: " + width);
        }
        if (height <= 0) {
            throw new IllegalArgumentException(
                    "illegal height: " + height);
        }

        return width * height;
    }
}
