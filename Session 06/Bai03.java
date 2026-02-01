class Product {
    private String maSP;
    private String tenSP;
    private double giaBan;

    public Product(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setGiaBan(giaBan);
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.out.println("Gia khong hop le, phai > 0");
        }
    }

    public void hienThiThongTin() {
        System.out.println("Ma SP: " + maSP);
        System.out.println("Ten SP: " + tenSP);
        System.out.println("Gia ban: " + giaBan);
        System.out.println("---------------------");
    }
}
public class Bai03 {
      public static void main(String[] args) {

        Product p = new Product("SP01", "Laptop", 15000000);

        System.out.println("Thong tin ban dau:");
        p.hienThiThongTin();

        System.out.println("Thu set gia khong hop le:");
        p.setGiaBan(-5000);

        System.out.println("Thong tin sau khi set sai:");
        p.hienThiThongTin();

        System.out.println("Set gia hop le:");
        p.setGiaBan(18000000);

        p.hienThiThongTin();
    }
}
