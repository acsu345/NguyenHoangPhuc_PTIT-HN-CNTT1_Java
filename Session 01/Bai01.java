
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        String bookID = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String bookName = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int publishYear = sc.nextInt();
        System.out.print("Nhap gia tien: ");
        double price = sc.nextDouble();
        System.out.print("Sach con khong? (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        int bookAge = 2026 - publishYear;
        String bookNameUpper = bookName.toUpperCase();
        String status = isAvailable ? "Con sach" : "Da muon";
        System.out.println("\nTHONG TIN SACH");
        System.out.println("Ma sach: " + bookID);
        System.out.println("Ten sach: " + bookNameUpper);
        System.out.println("Nam XB: " + publishYear);
        System.out.println("Tuoi tho sach: " + bookAge + " nam");
        System.out.printf("Gia tien: %.2f\n", price);
        System.out.println("Tinh trang: " + status);
    }
}