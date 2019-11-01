package com.homework.fourth;

/*
 * task from Stepik
 * https://stepik.org/lesson/12772/step/9?unit=3120
 */

public class ThrowException {

    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }
}
