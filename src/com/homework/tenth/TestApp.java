package com.homework.tenth;

public class TestApp {
    public static void main(String[] args) {
        MyMap<Integer, Integer> map = new MyMap<>();

        map.put(null, 1);
        map.put(null, 2);
        map.put(2, 3);
        map.put(3, 4);
        map.put(4, 5);
        map.put(5, 6);
        map.put(7, 7);
        map.put(6, 8);
        map.put(8, 9);
        map.put(8, 10);
        map.put(8, -1);
        map.put(2, -2);
        map.put(1, -3);
        map.put(-1, -4);
        map.put(-2, -5);
        map.put(-3, -6);
        map.put(-4, -7);

        System.out.println(map.get(-4));
        System.out.println(map.get(null));
        System.out.println(map.get(3));
        System.out.println(map.get(10));
        System.out.println(map.size());
    }
}
