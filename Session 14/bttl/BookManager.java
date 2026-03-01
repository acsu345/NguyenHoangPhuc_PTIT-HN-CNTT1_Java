package bttl;
import java.util.*;

public class BookManager {
    public static void main(String[] args) {
        // Initialize a list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("B001", "Java Programming", "Author A", "Publisher X", 2020, 500, 45.99));
        books.add(new Book("B002", "Data Structures", "Author B", "Publisher Y", 2018, 300, 35.50));
        books.add(new Book("B003", "Algorithms", "Author C", "Publisher Z", 2022, 400, 50.00));
        books.add(new Book("B004", "Database Systems", "Author D", "Publisher W", 2019, 600, 40.75));

        // Display the initial list of books
        System.out.println("Initial list of books:");
        books.forEach(System.out::println);

        // Sort and display books by title in ascending order
        books.sort(Comparator.comparing(Book::getTitle));
        System.out.println("\nBooks sorted by title (ascending):");
        books.forEach(System.out::println);

        // Sort and display books by price in descending order
        books.sort(Comparator.naturalOrder());
        System.out.println("\nBooks sorted by price (descending):");
        books.forEach(System.out::println);

        // Sort and display books by page count in ascending order
        books.sort(Comparator.comparingInt(Book::getPageCount));
        System.out.println("\nBooks sorted by page count (ascending):");
        books.forEach(System.out::println);

        // Sort and display books by publish year in descending order
        books.sort(Comparator.comparingInt(Book::getPublishYear).reversed());
        System.out.println("\nBooks sorted by publish year (descending):");
        books.forEach(System.out::println);
    }
}