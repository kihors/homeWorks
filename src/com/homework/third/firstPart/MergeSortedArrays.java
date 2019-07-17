package com.homework.third.firstPart;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] a1 = new int[]{1, 4, 5, 8, 9, 12, 13, 16};
        int[] a2 = new int[]{2, 3, 6, 7, 10, 11, 14, 15};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    private static int[] mergeArrays(int[] a1, int[] a2) {
        int[] mergeArray = new int[a1.length + a2.length];
        int a1_index = 0;
        int a2_index = 0;
        for (int i = 0; i < mergeArray.length; i++) {
            if (a1_index > a1.length - 1) {
                mergeArray[i] = a2[a2_index];
                a2_index++;
            } else if (a2_index > a2.length - 1) {
                mergeArray[i] = a1[a1_index];
                a1_index++;
            } else if (a1[a1_index] < a2[a2_index]) {
                mergeArray[i] = a1[a1_index];
                a1_index++;
            } else {
                mergeArray[i] = a2[a2_index];
                a2_index++;
            }
        }
        return mergeArray;
    }
}
