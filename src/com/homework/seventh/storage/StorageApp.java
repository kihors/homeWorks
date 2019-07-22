package com.homework.seventh.storage;

public class StorageApp {
    public static void main(String[] args) {
        Storage<Integer, String> storageFirst = new Storage<>();
        Storage<Integer, String> storageSecond = new Storage<>();

        storageFirst.put(13, "monkey");
        storageSecond.put(1, "doll");

        System.out.println(storageFirst.get(13));
        System.out.println(storageSecond.get(1));

    }
}
