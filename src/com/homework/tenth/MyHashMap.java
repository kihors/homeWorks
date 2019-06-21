package com.homework.tenth;

public class MyHashMap<K, V> {

    private Entry<K, V>[] buckets;
    private static final int INITIAL_CAPACITY = 1 << 4;
    private int size = 0;

    public MyHashMap() {
        this(INITIAL_CAPACITY);
    }

    public MyHashMap(int capacity) {
        this.buckets = new Entry[capacity];
    }

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value, null);
        int bucket = getHash(key) % getBucketSize();

        Entry<K, V> exiting = buckets[bucket];
        if (exiting == null) {
            buckets[bucket] = entry;
            size++;
        } else {
            while (exiting.next != null) {
                if (exiting.key.equals(key)) {
                    exiting.value = value;
                    return;
                }
                exiting = exiting.next;
            }
            if (exiting.key.equals(key)) {
                exiting.value = value;
            } else {
                exiting.next = entry;
                size++;
            }
        }
    }

    public V get(K key) {
        Entry<K, V> bucket = buckets[getHash(key) % getBucketSize()];

        while (bucket != null) {
            if (key == bucket.key) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    private int getBucketSize() {
        return buckets.length;
    }

    private int getHash(K key) {
        if (key == null) {
            return 0;
        } else {
            return Math.abs(key.hashCode());
        }
    }

    class Entry<K, V> {
        final K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
