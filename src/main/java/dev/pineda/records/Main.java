package dev.pineda.records;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static void main() {
        Product product = new Product("Book", 19.99);
        System.out.println("product = " + product);

        ProductDto productDto1 = new ProductDto("Book", 19.99);
        System.out.println("productDto1 = " + productDto1);

        ProductDto productDto2 = new ProductDto("Book");
        System.out.println("productDto2 = " + productDto2);

        ProductDto.print();

        try {
            ProductDto failedProduct = new ProductDto(null);
        } catch (NullPointerException error) {
            System.out.println("error = " + error.getMessage());
        }

        List<ProductDto> products = List.of(
                new ProductDto("Notebook", 1200.0),
                new ProductDto("Mouse", 25.5),
                new ProductDto("Keyboard", 55.0)
        );

        List<String> discountedProducts = products.stream()
                .map(p -> new ProductDto(p.name(), p.price() * 0.9))
                .map(p -> String.format("%s: %.2f", p.name(), p.price()))
                .toList();
        System.out.println("discountedProducts = " + discountedProducts);

        Map<String, List<ProductDto>> byPriceRange = products.stream()
                .collect(Collectors.groupingBy(p -> p.price() > 50 ? "Expensive" : "Budget"));
        System.out.println("byPriceRange = " + byPriceRange);

        Map<String, Long> countByRange = products.stream()
                .collect(Collectors.groupingBy(p -> p.price() > 50 ? "Expensive" : "Budget", Collectors.counting()));
        System.out.println("countByRange = " + countByRange);

        double total = products.stream()
                .mapToDouble(ProductDto::price)
                .sum();
        System.out.println("total = " + total);

        double totalWithReduce = products.stream()
                .map(ProductDto::price)
                .reduce(0.0, Double::sum);
        System.out.println("totalWithReduce = " + totalWithReduce);

        String productSummary = products.stream()
                .map(p -> p.name() + "( $" + p.price() + " )")
                .reduce("", (s1, s2) ->
                        s1.isEmpty() ? s2 : s1 + " | " + s2
                );
        System.out.println("productSummary = " + productSummary);

        Set<Double> uniquePrices = products.stream()
                .map(ProductDto::price)
                .collect(Collectors.toSet());
        System.out.println("uniquePrices = " + uniquePrices);

        Map<String, Double> productMap = products.stream()
                .collect(Collectors.toMap(ProductDto::name, ProductDto::price));
        System.out.println("productMap = " + productMap);

        List<ProductDto> productsWithDuplicatedKeyboard = Stream.concat(products.stream(), Stream.of(new ProductDto("Keyboard", 60.0)))
                .toList();
        System.out.println("productsWithDuplicatedKeyboard = " + productsWithDuplicatedKeyboard);

        try {
            Map<String, Double> productMapWithDuplicates = productsWithDuplicatedKeyboard.stream()
                    .collect(Collectors.toMap(ProductDto::name, ProductDto::price));
            System.out.println("productMapWithDuplicates = " + productMapWithDuplicates);
        } catch (IllegalStateException error) {
            System.out.println("error = " + error.getMessage());
        }

        Map<String, Double> productMapWithDuplicates = productsWithDuplicatedKeyboard.stream()
                .collect(
                        Collectors.toMap(
                                ProductDto::name,
                                ProductDto::price,
                                (existingPrice, newPrice) -> newPrice > existingPrice ? newPrice : existingPrice)
                );
        System.out.println("productMapWithDuplicates = " + productMapWithDuplicates);

        List<ProductDto> expensiveProducts = productMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 50)
                .map(entry -> new ProductDto(entry.getKey(), entry.getValue()))
                .toList();
        System.out.println("expensiveProducts = " + expensiveProducts);

    }
}
