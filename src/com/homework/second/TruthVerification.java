package com.homework.second;

/*
 * task from Stepik
 * https://stepik.org/lesson/12759/step/6?unit=3107
 */

public class TruthVerification {

    public static void main(String[] args) {
        System.out.println(booleanExpression(true, true, false, false));
    }

    private static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a ^ b) & (c ^ d) || (a ^ c) & (b ^ d);
    }
}
