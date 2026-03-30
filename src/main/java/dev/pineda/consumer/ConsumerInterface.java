package dev.pineda.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterface {
    static void main() {
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("hello world");

        BiConsumer<String, Integer> printRepeated = (s1, times) -> {
            for (int i = 0; i < times; i++) {
                System.out.println(i + 1 + ": " + s1);
            }
        };
        printRepeated.accept("Hello again!", 3);
    }
}
