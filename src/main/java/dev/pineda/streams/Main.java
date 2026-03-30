package dev.pineda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Stream<Integer> numberStream = numbers.stream();
        System.out.println("numberStream");
        numberStream.forEach(System.out::println);

        Stream<String> stringStream = Stream.of("Hello", "World", "Java", "Streams");
        System.out.println("stringStream");
        stringStream.forEach(System.out::println);

        String[] array = {"Hello", "World", "Java", "Streams"};
        Stream<String> arrayString = Arrays.stream(array);
        System.out.println("arrayString");
        arrayString.forEach(System.out::println);

        Stream<String> helloStream = Stream.generate(() -> "Hello").limit(3);
        System.out.println("helloStream");
        helloStream.forEach(System.out::println);

        List<String> names = List.of("John", "Jane", "Doe");
        System.out.println("names in uppercase");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
