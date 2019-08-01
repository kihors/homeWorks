package com.homework.eleventh;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; scanner.hasNextInt(); i++) {
            if (i % 2 != 0) {
                arrayDeque.add(scanner.nextInt());
            } else {
                scanner.nextInt();
            }
        }
        int size = arrayDeque.size();
        for (int i = 0; i < size; i++) {
            System.out.print(arrayDeque.removeLast() + " ");
        }
    }
}
