package dev.pineda.calculator;

@FunctionalInterface
interface Operation {
    int operate(int a, int b);
}

public class Calculator {
    static void main() {
        Calculator calculator = new Calculator();
        calculator.operateAndPrint(5, 3, Integer::sum);
        calculator.operateAndPrint(6, 4, (a, b) -> a - b);
        calculator.operateAndPrint(7, 2, (a, b) -> a * b);
        calculator.operateAndPrint(8, 2, (a, b) -> a / b);

    }

    void operateAndPrint(int a, int b, Operation operation) {
        int result = operation.operate(a, b);
        System.out.println("result = " + result);
    }
}
