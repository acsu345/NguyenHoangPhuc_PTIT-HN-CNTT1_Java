class Employee {
    String maNV;
    String tenNV;
    double luong;

    public Employee() {
        this.maNV = "Chua co";
        this.tenNV = "Chua co";
        this.luong = 0;
    }

    public Employee(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = 0;
    }

    public Employee(String maNV, String tenNV, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }

    public void hienThiThongTin() {
        System.out.println("Ma NV: " + maNV);
        System.out.println("Ten NV: " + tenNV);
        System.out.println("Luong: " + luong);
        System.out.println("---------------------");
    }
}


public class Bai04 {
     public static void main(String[] args) {

        Employee nv1 = new Employee();
        Employee nv2 = new Employee("NV01", "Nguyen Van A");
        Employee nv3 = new Employee("NV02", "Tran Thi B", 15000000);

        System.out.println("Nhan vien 1:");
        nv1.hienThiThongTin();

        System.out.println("Nhan vien 2:");
        nv2.hienThiThongTin();

        System.out.println("Nhan vien 3:");
        nv3.hienThiThongTin();
    }
}
