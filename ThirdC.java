import java.util.*;
// import java.util.stream.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + price;
    }
}

public class ThirdC {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Laptop", 80000),
                new Product(2, "Mouse", 1200),
                new Product(3, "Keyboard", 2500),
                new Product(4, "Monitor", 15000),
                new Product(5, "Phone", 30000)
        );

        // Filter products with price > 5000
        System.out.println("Products with price > 5000:");
        products.stream()
                .filter(p -> p.price > 5000)
                .forEach(System.out::println);

        // Get list of product names
        System.out.println("\nProduct Names:");
        products.stream()
                .map(p -> p.name)
                .forEach(System.out::println);

        // Calculate total price using reduce
        double total = products.stream()
                .map(p -> p.price)
                .reduce(0.0, Double::sum);
        System.out.println("\nTotal Price of All Products: " + total);
    }
}