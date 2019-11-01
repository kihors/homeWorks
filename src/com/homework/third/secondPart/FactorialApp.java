package com.homework.third.secondPart;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * task from Stepik
 * https://stepik.org/lesson/12762/step/8?unit=3110
 */

public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        System.out.println(factorial(scanner.nextInt()));
    }

    private static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
