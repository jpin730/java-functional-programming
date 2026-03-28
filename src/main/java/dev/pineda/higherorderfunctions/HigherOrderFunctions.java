package dev.pineda.higherorderfunctions;

@FunctionalInterface
interface Operation {
    int compute(int a, int b);
}

public class HigherOrderFunctions {
    static void main() {
        int result1 = applyOperation(6, 2, (x, y) -> x * y);
        System.out.println("result1 = " + result1);

        int result2 = applyOperation(10, 5, (x, y) -> x - y);
        System.out.println("result2 = " + result2);
    }

    static int applyOperation(int x, int y, Operation op) {
        return op.compute(x, y);
    }
}