import java.util.Scanner;

public class Bai01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap the loai: ");
        String theLoai = sc.nextLine();
        tenSach = tenSach.trim().replaceAll("\\s+", " ");
        tacGia = tacGia.trim().replaceAll("\\s+", " ");
        theLoai = theLoai.trim().replaceAll("\\s+", " ");
        tenSach = tenSach.toUpperCase();
        String[] tu = tacGia.split(" ");
        String tacGiaChuan = "";
        for (int i = 0; i < tu.length; i++) {
            String word = tu[i];
            String chuan = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            tacGiaChuan = tacGiaChuan + chuan + " ";
        }
        tacGiaChuan = tacGiaChuan.trim();
        System.out.println("\nKet qua:");
        System.out.println(tenSach + " - Tac gia: " + tacGiaChuan);
    }
}
