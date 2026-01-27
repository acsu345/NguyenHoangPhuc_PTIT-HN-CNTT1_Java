import java.util.Scanner;

public class Bai05 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101, 102, 103, 104, 105};
        int n = 5;
        while (n > 0) {
            System.out.print("\nKho sach hien tai (" + n + " cuon): [ ");
            for (int i = 0; i < n; i++) {
                System.out.print(books[i] + " ");
            }
            System.out.println("]");
            System.out.print("Nhap ma sach can xoa (0 de thoat): ");
            int bookId = sc.nextInt();
            if (bookId == 0) {
                break;
            }
            int pos = -1;
            for (int i = 0; i < n; i++) {
                if (books[i] == bookId) {
                    pos = i;
                    break;
                }
            }
            if (pos == -1) {
                System.out.println("Khong tim thay sach ma " + bookId);
                continue;
            }

            for (int i = pos; i < n - 1; i++) {
                books[i] = books[i + 1];
            }
            n--;
            System.out.println("Da xoa sach ma " + bookId);
        }
        System.out.println("Ket thuc chuong trinh");
    }
}
