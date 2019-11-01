package com.homework.third.secondPart;

/*
 * task from Stepik
 * https://stepik.org/lesson/12761/step/10?unit=3109
 */

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }

    public static boolean isPalindrome(String text) {
        String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);
    }
}
