package com.homework.thirteenth;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMinMax {
    public static <T> void findMinMax(Stream<? extends T> stream,
                                      Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> item = stream.sorted(order).collect(Collectors.toList());
        if (!item.isEmpty()) {
            minMaxConsumer.accept(item.get(0), item.get(item.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }
}
