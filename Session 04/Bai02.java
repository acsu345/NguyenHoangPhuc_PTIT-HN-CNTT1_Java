import java.util.Scanner;

public class Bai02 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mo ta sach: ");
        String moTa = sc.nextLine();
        if (moTa.contains("Kệ:")) {
            int viTriBatDau = moTa.indexOf("Kệ:") + 3;
            String phanConLai = moTa.substring(viTriBatDau).trim();
            String maKe;
            if (phanConLai.contains(",")) {
                maKe = phanConLai.substring(0, phanConLai.indexOf(",")).trim();
            } else {
                maKe = phanConLai;
            }
            System.out.println("Ma vi tri ke sach: " + maKe);
            moTa = moTa.replace("Kệ:", "Vị trí lưu trữ:");
        }
        System.out.println("Mo ta sau khi chinh sua:");
        System.out.println(moTa);
    }
}
