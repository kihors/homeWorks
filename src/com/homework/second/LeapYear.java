package com.homework.second;

/*
 * task from Stepik
 * https://stepik.org/lesson/12759/step/8?unit=3107
 */

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(leapYearCount(2019));
    }

    private static int leapYearCount(int year) {
        return year / 4 - year / 100 + year / 400;
    }
}
