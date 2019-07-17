package com.homework.second;

public class TruthVerification {

    public static void main(String[] args) {
        System.out.println(booleanExpression(true, true, false, false));
    }

    private static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a ^ b) & (c ^ d) || (a ^ c) & (b ^ d);
    }
}
