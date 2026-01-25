import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap gia sach (USD): ");
        double giaUSD = sc.nextDouble();

        System.out.print("Nhap ty gia USD sang VND: ");
        float tyGia = sc.nextFloat();

        double tienVND = giaUSD * tyGia;

        long tienChan = (long) tienVND;

        System.out.println("Tong tien VND (da lam tron): " + tienChan);
    }
}
