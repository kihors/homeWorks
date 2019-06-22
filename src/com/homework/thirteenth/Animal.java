package com.homework.thirteenth;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    public static Animal[] deserializeAnimal(byte[] data) {

        int countOfAnimals = 0;
        Animal[] animals = new Animal[0];

        ByteArrayInputStream dataInputStream = new ByteArrayInputStream(data);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(dataInputStream);
            countOfAnimals = objectInputStream.readInt();
            animals = new Animal[countOfAnimals];

            for (int i = 0; i < countOfAnimals; i++) {
                Animal animal = (Animal) objectInputStream.readObject();
                animals[i] = animal;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return animals;
    }
}
