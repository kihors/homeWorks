package com.homework.fourteenth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
                .sorted((a1, a2) -> {
                    int res = a2.getValue().compareTo(a1.getValue());
                    return res != 0 ? res : a1.getKey().compareTo(a2.getKey());
                })
                .limit(10)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
