package com.homework.tenth;

public class TestApp {
    public static void main(String[] args) {
        MyHashMap<Integer, String > myHashMap = new MyHashMap<>();
        myHashMap.put(1, "One");
        myHashMap.put(2, "Two");
        myHashMap.put(3, "Three");
        myHashMap.put(4, "Four");
        myHashMap.put(5, "Five");
        myHashMap.put(6, "Six");
        myHashMap.put(7, "Seven");
        myHashMap.put(8, "Eight");
        myHashMap.put(9, "Nine");
        myHashMap.put(10, "Ten");

        for (int i = 1; i < 100; i++) {
            String value = "Key value is " + i;
            myHashMap.put(i, value);
        }

        System.out.println(myHashMap.size());
        System.out.println(myHashMap.get(5));
        System.out.println(myHashMap.get(10));
        System.out.println(myHashMap.get(20));
        System.out.println(myHashMap.get(200));
    }
}
