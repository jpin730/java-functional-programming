package dev.pineda.purefunctions;

import java.util.function.Function;

public class PureFunction {
    static void main() {
        int imperativeResult = multiplyByTwoImperative(4);
        System.out.println("imperativeResult = " + imperativeResult);

        int functionalResult = multiplyByTwoFunctional(4);
        System.out.println("functionalResult = " + functionalResult);
    }

    public static int multiplyByTwoImperative(int value) {
        return value * 2;
    }

    public static int multiplyByTwoFunctional(int value) {
        Function<Integer, Integer> multiply = (num) -> num * 2;
        return multiply.apply(value);
    }
}
