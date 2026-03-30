package dev.pineda.supplier;

import java.util.function.Supplier;

public class SupplierInterface {
    static void main() {
        Supplier<String> randomStringSupplier = () -> {
            String[] strings = {"Hello", "World", "Java", "Supplier"};
            int index = (int) (Math.random() * strings.length);
            return strings[index];
        };

        String result = randomStringSupplier.get();
        System.out.println("Random String: " + result);
    }
}
