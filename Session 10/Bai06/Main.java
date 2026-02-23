package Bai06;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 600));
        products.add(new Product("Mouse", 50));


        Collections.sort(products, new Comparator<Product>() {

            private int compareCount = 0;

            @Override
            public int compare(Product p1, Product p2) {
                compareCount++; 
                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("=== Sắp xếp theo GIÁ tăng dần (Anonymous Class) ===");
        for (Product p : products) {
            System.out.println(p);
        }

        Collections.sort(products, (p1, p2) -> p1.name.compareTo(p2.name));

        System.out.println("\n=== Sắp xếp theo TÊN A-Z (Lambda) ===");
        products.forEach(System.out::println);
    }
}