package dev.pineda.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Collections {
    static void main() {
        List<String> names = List.of("John", "Jane", "Doe");

        System.out.print("forEach: ");
        names.forEach(System.out::println);

        System.out.print("forEach with Consumer: ");
        Consumer<String> printName = System.out::println;
        names.forEach(printName);

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("numbers = " + numbers);

        List<String> words = new ArrayList<>(List.of("apple", "banana", "cherry"));
        words.replaceAll(String::toUpperCase);
        System.out.println("words = " + words);
    }
}
