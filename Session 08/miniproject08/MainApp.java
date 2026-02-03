package miniproject08;

import java.util.Scanner;

public class MainApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        StudentManager manager = new StudentManager(100); 
        int choice;

        do {
            System.out.println("\n===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Hiển thị tất cả sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Cập nhật thông tin sinh viên");
            System.out.println("5. Xóa sinh viên");
            System.out.println("6. Tính điểm trung bình và xếp loại");
            System.out.println("7. Sắp xếp sinh viên");
            System.out.println("8. Thống kê");
            System.out.println("9. Thoát");
            System.out.print("Chọn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent(manager);
                    break;

                case 2:
                    manager.displayAll();
                    break;

                case 3:
                    searchMenu(manager);
                    break;

                case 4:
                    updateStudent(manager);
                    break;

                case 5:
                    System.out.print("Nhập mã SV cần xóa: ");
                    System.out.println(
                        manager.removeStudent(sc.nextLine())
                            ? "Đã xóa!"
                            : "Không tìm thấy!"
                    );
                    break;

                case 6:
                    calculateAverageAndClassification();
                    break;

                case 7:
                    sortMenu(manager);
                    break;

                case 8:
                    manager.statistics();
                    break;

                case 9:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 9);
    }

    // ===== Các hàm hỗ trợ =====
    static void addStudent(StudentManager m) {
        System.out.print("Mã SV: ");
        String id = sc.nextLine();
        System.out.print("Họ tên: ");
        String name = sc.nextLine();
        System.out.print("Tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Giới tính: ");
        String gender = sc.nextLine();
        System.out.print("Điểm Toán - Lý - Hóa: ");
        double t = sc.nextDouble();
        double l = sc.nextDouble();
        double h = sc.nextDouble();
        sc.nextLine();

        // Ensure Student is defined or imported correctly
        Student s = new Student(id, name, age, gender, t, l, h); // Replace with actual implementation
        System.out.println(m.addStudent(s) ? "Thêm thành công!" : "Thêm thất bại!");
    }

    static void updateStudent(StudentManager m) {
        System.out.print("Nhập mã SV: ");
        String id = sc.nextLine();
        System.out.print("Họ tên mới: ");
        String name = sc.nextLine();
        System.out.print("Tuổi mới: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Giới tính mới: ");
        String gender = sc.nextLine();
        System.out.print("Điểm Toán - Lý - Hóa mới: ");
        double t = sc.nextDouble();
        double l = sc.nextDouble();
        double h = sc.nextDouble();
        sc.nextLine();

        System.out.println(
            m.updateStudent(id, name, age, gender, t, l, h)
                ? "Cập nhật thành công!"
                : "Không tìm thấy sinh viên!"
        );
    }

    static void sortMenu(StudentManager m) {
        System.out.println("1. Sắp xếp theo tên (A-Z)");
        System.out.println("2. Sắp xếp theo điểm TB giảm dần");
        System.out.print("Chọn: ");
        int c = sc.nextInt();
        sc.nextLine();

        if (c == 1) {
            m.sortByName();
            System.out.println("Đã sắp xếp theo tên!");
        } else if (c == 2) {
            m.sortByAverageScoreDesc();
            System.out.println("Đã sắp xếp theo điểm!");
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
    }
    static void searchMenu(StudentManager manager) {
    System.out.println("1. Tìm theo mã sinh viên");
    System.out.println("2. Tìm theo tên sinh viên");
    System.out.print("Chọn: ");
    int c = sc.nextInt();
    sc.nextLine();

    if (c == 1) {
        System.out.print("Nhập mã SV: ");
        String id = sc.nextLine();
        int idx = manager.findById(id);
        if (idx == -1) {
            System.out.println("Không tìm thấy sinh viên!");
        } else {
            System.out.printf(
                "%-10s %-20s %-5s %-8s %-8s %-10s\n",
                "Mã SV", "Họ tên", "Tuổi", "GT", "ĐTB", "Xếp loại"
            );
            manager.displayAll(); 
        }

    } else if (c == 2) {
        System.out.print("Nhập tên cần tìm: ");
        manager.findByName(sc.nextLine());
    } else {
        System.out.println("Lựa chọn không hợp lệ!");
    }
}
    static void calculateAverageAndClassification() {

        System.out.print("Nhập điểm Toán: ");
        double toan = sc.nextDouble();

        System.out.print("Nhập điểm Lý: ");
        double ly = sc.nextDouble();

        System.out.print("Nhập điểm Hóa: ");
        double hoa = sc.nextDouble();

        double diemTrungBinh = (toan + ly + hoa) / 3;
        String xepLoai;

        if (diemTrungBinh >= 8.0 && toan >= 6.5 && ly >= 6.5 && hoa >= 6.5) {
            xepLoai = "Giỏi";
        } else if (diemTrungBinh >= 6.5 && toan >= 5.0 && ly >= 5.0 && hoa >= 5.0) {
            xepLoai = "Khá";
        } else if (diemTrungBinh >= 5.0 && toan >= 3.5 && ly >= 3.5 && hoa >= 3.5) {
            xepLoai = "Trung bình";
        } else {
            xepLoai = "Yếu";
        }

        System.out.printf("Điểm trung bình: %.2f\n", diemTrungBinh);
        System.out.println("Xếp loại: " + xepLoai);
    }


}