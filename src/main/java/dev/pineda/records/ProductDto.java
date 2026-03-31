package dev.pineda.records;

import java.util.Objects;

public record ProductDto(String name, double price) {
    public ProductDto {
        Objects.requireNonNull(name, "Name cannot be null");
    }

    public ProductDto(String name) {
        this(name, 0);
    }

    static void print() {
        System.out.println("Hello from ProductDto");
    }
}
