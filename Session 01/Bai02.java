import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so ngay cham tre: ");
        int n = sc.nextInt();

        System.out.print("Nhap so luong sach muon: ");
        int m = sc.nextInt();

        double tienPhatGoc = n * m * 5000;
        double tienPhatSau = tienPhatGoc;

        if (n > 7 && m >= 3) {
            tienPhatSau = tienPhatGoc * 1.2;
        }

        boolean khoaThe;
        if (tienPhatSau > 50000) {
            khoaThe = true;
        } else {
            khoaThe = false;
        }

        System.out.println("\nTien phat goc: " + tienPhatGoc + " VND");
        System.out.println("Tien phat sau dieu chinh: " + tienPhatSau + " VND");
        System.out.println("Yeu cau khoa the: " + khoaThe);
    }
}
