package com.homework.tenth;

import java.util.Objects;

public class MyMap<K, V> implements Map<K, V> {

    private static double LOAD_FACTOR = 0.75;
    private Node<K, V>[] objects;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public V get(K key) {
        int index = getIndexFromHash(key);
        Node<K, V> currentNode = objects[index];
        while (currentNode != null) {
            if (Objects.equals(currentNode.key, key)) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    @Override
    public void put(K key, V value) {
        grow();
        Node<K, V> newNode = new Node<>(key, value);
        putNode(newNode);
    }

    private void putNode(Node<K, V> node) {
        int index = getIndexFromHash(node.key);
        Node<K, V> currentNode = objects[index];
        if (currentNode == null) {
            objects[index] = node;
        } else {
            Node<K, V> tempNode = currentNode;
            while (tempNode != null) {
                if (Objects.equals(tempNode.key, node.key)) {
                    tempNode.value = node.value;
                    return;
                }
                currentNode = tempNode;
                tempNode = tempNode.next;
            }
            currentNode.next = node;
        }
        size++;
    }

    private void grow() {
        if (objects == null || objects.length == 0) {
            objects = new Node[16];
        } else if (size >= (int) (objects.length * LOAD_FACTOR)) {
            int newCapacity = objects.length << 1;
            Node<K, V>[] tempObjects = objects;
            size = 0;
            objects = new Node[newCapacity];
            for (Node<K, V> node : tempObjects) {
                if (node != null) {
                    Node<K, V> tempNode = node.next;
                    node.next = null;
                    putNode(node);
                    while (tempNode != null) {
                        putNode(tempNode);
                        tempNode = tempNode.next;
                    }
                }
            }
        }
    }

    private int getIndexFromHash(K key) {
        int hashcode;
        if (key == null) {
            hashcode = 0;
        } else {
            hashcode = key.hashCode();
        }
        return Math.abs(hashcode % objects.length);
    }

    private class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
