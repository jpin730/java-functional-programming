package dev.pineda.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterface {
    static void main() {
        Function<String, Integer> stringLength = String::length;
        String input = "Hello, World!";
        int length = stringLength.apply(input);
        System.out.println("Length of '" + input + "' is: " + length);

        BiFunction<Integer, Integer, String> sumToString = (a, b) -> "The sum of " + a + " and " + b + " is: " + (a + b);
        String result = sumToString.apply(5, 10);
        System.out.println("result = " + result);

    }
}
