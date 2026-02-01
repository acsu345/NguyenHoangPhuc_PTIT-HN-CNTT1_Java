class Book {
    String maSach;
    String tenSach;
    String tacGia;
    String nhaXuatBan;
    int namXuatBan;
    int soTrang;
    double giaTien;

    public Book() {
        this.maSach = "";
        this.tenSach = "";
        this.tacGia = "";
        this.nhaXuatBan = "";
        this.namXuatBan = 0;
        this.soTrang = 0;
        this.giaTien = 0.0;
    } 

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So trang: " + soTrang);
        System.out.println("Gia tien: " + giaTien);
    }
}
    
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.maSach = "B001";
        book1.tenSach = "Java Co Ban";
        book1.tacGia = "Nguyen Van A";
        book1.nhaXuatBan = "NXB Tre";
        book1.namXuatBan = 2002;
        book1.soTrang = 245;
        book1.giaTien = 50000.0; 
        book1.hienThiThongTin();
    }
}