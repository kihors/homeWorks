package com.homework.tenth;

public interface Map<K, V> {
    int size();

    V get(K key);

    void put(K key, V value);
}
