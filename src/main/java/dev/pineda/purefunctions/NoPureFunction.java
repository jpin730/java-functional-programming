package dev.pineda.purefunctions;

public class NoPureFunction {
    static int counter = 0; // shared state

    public static int incrementCounter(int value) {
        counter += value; // modifies shared state
        return counter;
    }

    static void main() {
        System.out.println("Result 1: " + incrementCounter(5));
        System.out.println("Result 2: " + incrementCounter(5));
    }
}
