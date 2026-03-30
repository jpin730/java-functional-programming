package dev.pineda.collections;

import java.util.ArrayList;
import java.util.List;

public class Streams {
    static void main() {
        List<String> fruits = new ArrayList<>(List.of("apple", "banana", "cherry", "date", "elderberry"));
        System.out.println("fruits = " + fruits);

        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.length() > 5)
                .toList();
        System.out.println("filteredFruits = " + filteredFruits);

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("numbers = " + numbers);

        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println("squaredNumbers = " + squaredNumbers);
    }
}
