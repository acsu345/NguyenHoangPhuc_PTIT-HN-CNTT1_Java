class Book {
    String maSach;
    String tenSach;
    String tacGia;
    int namXuatBan;

    public Book(String maSach, String tenSach, String tacGia, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("--------------------");
    }
}

public class Bai05 {
     public static void main(String[] args) {

        Book book1 = new Book(
                "B001",
                "Lap trinh Java",
                "Nguyen Van A",
                2024
        );

        book1.hienThiThongTin();
    }
}
