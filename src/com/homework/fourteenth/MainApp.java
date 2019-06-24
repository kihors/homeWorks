package com.homework.fourteenth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        new BufferedReader(new InputStreamReader(System.in)).lines()
                .map(str -> str.split("[^a-zA-Zа-яА-Я0-9]+"))
                .flatMap(Arrays::stream)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
