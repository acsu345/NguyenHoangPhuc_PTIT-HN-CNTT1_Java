import java.util.Scanner;

public class Bai01 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of books: ");
            int n = scanner.nextInt();
            int[] books = new int[n];

            System.out.println("Enter " + n + " book ISBNs:");
            for (int i = 0; i < n; i++) {
                System.out.print("Book " + (i + 1) + ": ");
                books[i] = scanner.nextInt();
            }

            System.out.println("Library ISBNs:");
            for (int i = 0; i < books.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(books[i]);
            }
            System.out.println();
        }
    }
}
