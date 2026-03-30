package dev.pineda.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Methods {
    static void main() {
        List<String> names = List.of("Anne", "Louis", "Martha", "John", "Anne", "Jane");
        System.out.println("names = " + names);
        List<String> longNames = names.stream()
                .filter(name -> name.length() > 4)
                .toList();
        System.out.println("longNames = " + longNames);
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .toList();
        System.out.println("nameLengths = " + nameLengths);

        List<List<Integer>> nestedList = List.of(List.of(1, 2), List.of(3, 4));
        System.out.println("nestedList = " + nestedList);
        List<Integer> flattedNames = nestedList.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("flattedNames = " + flattedNames);

        List<Integer> numbers = List.of(3, 1, 3, 5, 2);
        System.out.println("numbers = " + numbers);
        List<Integer> uniqueOrderedNumbers = numbers.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println("uniqueOrderedNumbers = " + uniqueOrderedNumbers);

        Set<String> nameSet = names.stream()
                .filter(name -> name.length() > 2)
                .collect(Collectors.toSet());
        System.out.println("nameSet = " + nameSet);

        long count = names.stream()
                .filter(name -> name.contains("n"))
                .count();
        System.out.println("count = " + count);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("sum = " + sum);

        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
