package dev.pineda.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateInterface {
    static void main() {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("isEven.test(4) = " + isEven.test(4));
        System.out.println("isEven.test(5) = " + isEven.test(5));

        BiPredicate<Integer, Integer> isGreaterThan = (a, b) -> a > b;
        System.out.println("isGreaterThan.test(5, 3) = " + isGreaterThan.test(5, 3));
        System.out.println("isGreaterThan.test(2, 4) = " + isGreaterThan.test(2, 4));
    }
}
