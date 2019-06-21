package com.homework.eighth;

import java.util.Arrays;

public class MyArrayList<T> implements List<T> {

    private static final int ORIGINAL_CAPACITY = 10;
    private int arraySize;
    private T[] array;

    public MyArrayList() {
        this.array = (T[]) new Object[ORIGINAL_CAPACITY];
    }

    @Override
    public void add(T value) {
        if (arraySize >= array.length - 1) {
            array = Arrays.copyOf(array, array.length + (array.length >> 1));
        }
        array[arraySize] = value;
        arraySize++;
    }

    @Override
    public void add(T value, int index) {
        arraySize++;
        if (indexOutOfBounds(index)) {
            if (arraySize >= array.length - 1) {
                array = Arrays.copyOf(array, array.length + (array.length >> 1));
            }
            System.arraycopy(array, index, array, index + 1, array.length - index - 1);
            array[index] = value;
        }
    }

    @Override
    public void addAll(List<T> list) {
        int indexPosition = arraySize;
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i), indexPosition + i);
        }
    }

    @Override
    public T get(int index) {
        if (indexOutOfBounds(index)) {
            return array[index];
        }
        return null;
    }

    @Override
    public void set(T value, int index) {
        if (indexOutOfBounds(index)) {
            array[index] = value;
        }
        array[index] = null;
    }

    @Override
    public T remove(int index) {
        if (!indexOutOfBounds(index)) {
            T deleteElement = array[index];
            remover(index);
            return deleteElement;
        }
        return null;
    }

    @Override
    public T remove(T t) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(t)) {
                remover(i);
                return t;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return arraySize;
    }

    @Override
    public boolean isEmpty() {
        return arraySize == 0;
    }

    private boolean indexOutOfBounds(int index) {
        if (index >= arraySize || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index does not exist");
        }
        return true;
    }

    private void remover(int index) {
        System.arraycopy(array, index + 1, array, index, array.length - index - 1);
        array = Arrays.copyOf(array, array.length - 1);
        arraySize--;
    }
}
