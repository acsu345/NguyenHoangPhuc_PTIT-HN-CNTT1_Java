import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        String[] books = {"To Kill a Mockingbird", "1984", "The Great Gatsby", "The Catcher in the Rye", "Moby Dick"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten sach ma ban dang can tim: ");
        String search = scanner.nextLine();
        int result = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(search)) {
                result = i;
                break;
            }
        }
        if (result != -1) {
            System.out.println("Tim thay tai vi tri " + result);
        } else {
            System.out.println("Sach khong ton tai");
        }

        scanner.close();
    }
}