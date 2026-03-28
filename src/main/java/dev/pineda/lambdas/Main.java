package dev.pineda.lambdas;

@FunctionalInterface
interface Operation {
    int operate(int a, int b);
}

public class Main {
    static void main() {
        Operation add = new Operation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int anonymousClassResult = add.operate(1, 2);
        System.out.println("anonymousClassResult = " + anonymousClassResult);

        Operation multiply = (a, b) -> a * b;
        int lambdaResult = multiply.operate(2, 3);
        System.out.println("lambdaResult = " + lambdaResult);
    }
}