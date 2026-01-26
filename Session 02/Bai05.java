import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diemUyTin = 100;
        int soNgayTre;

        System.out.println("Nhap so ngay tre moi lan tra sach (999 de ket thuc)");

        while (true) {
            System.out.print("Nhap so ngay: ");
            soNgayTre = sc.nextInt();

            if (soNgayTre == 999) {
                break;
            }

            if (soNgayTre <= 0) {
                diemUyTin = diemUyTin + 5;
            } else {
                diemUyTin = diemUyTin - (soNgayTre * 2);
            }
        }

        System.out.println("\nTong diem uy tin: " + diemUyTin);

        if (diemUyTin > 120) {
            System.out.println("Xep loai: Doc gia Than thiet");
        } else if (diemUyTin >= 80) {
            System.out.println("Xep loai: Doc gia Tieu chuan");
        } else {
            System.out.println("Xep loai: Doc gia can luu y");
        }
    }
}
