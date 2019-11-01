package com.homework.second;

/*
 * task from Stepik
 * https://stepik.org/lesson/12759/step/12?unit=3107
 */

public class CheckingExpression {

    public static void main(String[] args) {
        System.out.println(doubleExpression(3.02, 5.03, 8.05));
    }

    private static final double ERROR = 0.0001;

    private static boolean doubleExpression(double firstValue, double secondValue, double sum) {
        return Math.abs(firstValue + secondValue - sum) < ERROR;
    }
}
