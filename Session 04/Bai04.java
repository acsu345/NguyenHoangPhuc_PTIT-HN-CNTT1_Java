import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma the: ");
        String cardId = sc.nextLine();

        if (!cardId.matches("^[A-Z]{2}.*")) {
            System.out.println("Thieu tien to 2 chu cai viet hoa");
        } else if (!cardId.matches("^[A-Z]{2}\\d{4}.*")) {
            System.out.println("Nam khong hop le");
        } else if (!cardId.matches("^[A-Z]{2}\\d{9}$")) {
            System.out.println("Phan so ngau nhien phai du 5 chu so");
        } else {
            System.out.println("Ma the hop le");
        }
    }
}
