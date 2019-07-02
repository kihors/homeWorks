package com.homework.tenth;

public interface Map<K, V> {

    int size();
    boolean isEmpty();

    V get(Object key);
    V put(K key, V value);
    V remove(Object key);
}
