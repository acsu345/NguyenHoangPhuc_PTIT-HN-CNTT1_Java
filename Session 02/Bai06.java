import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int min = -1;
        int tong = 0;
        int soNgayMoCua = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nhap so luot muon cua ngay thu " + i + ": ");
            int luotMuon = sc.nextInt();

            if (luotMuon == 0) {
                continue;
            }

            if (max == -1 || luotMuon > max) {
                max = luotMuon;
            }

            if (min == -1 || luotMuon < min) {
                min = luotMuon;
            }

            tong = tong + luotMuon;
            soNgayMoCua++;
        }

        if (soNgayMoCua > 0) {
            double trungBinh = (double) tong / soNgayMoCua;

            System.out.println("\nLuot muon cao nhat: " + max);
            System.out.println("Luot muon thap nhat: " + min);
            System.out.println("Luot muon trung binh: " + trungBinh);
        } else {
            System.out.println("Khong co ngay nao mo cua");
        }
    }
}
