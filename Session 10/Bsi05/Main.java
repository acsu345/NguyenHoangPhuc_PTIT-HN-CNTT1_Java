package Bsi05;

public class Main {
    public static void main(String[] args) {

        Employee staff = new OfficeStaff("Nguyễn Văn A", 8000000);
        Employee manager = new Manager("Trần Thị B", 15000000, 5000000);

        System.out.println("=== BẢNG LƯƠNG ===");

        System.out.println("\n--- Nhân viên văn phòng ---");
        staff.displayInfo();
        System.out.println("Tổng lương: " + staff.calculateSalary());

        System.out.println("\n--- Quản lý ---");
        manager.displayInfo();
        System.out.println("Tổng lương: " + manager.calculateSalary());
    }
}
