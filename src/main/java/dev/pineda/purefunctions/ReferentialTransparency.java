package dev.pineda.purefunctions;

public class ReferentialTransparency {
    static void main() {
        int result1 = triple(3) + 2;
        System.out.println("result2 = " + result1);

        // function can be replaced with its result without changing the program's behavior
        int result2 = 9 + 2;
        System.out.println("result2 = " + result2);
    }

    public static int triple(int value) {
        return value * 3;
    }
}
