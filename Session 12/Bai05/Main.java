package Bai05;

import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Patient> patientList = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== QUẢN LÝ BỆNH NHÂN =====");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách");
            System.out.println("5. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    displayPatients();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }

    public static void addPatient() {
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();

        for (Patient p : patientList) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.println("ID đã tồn tại! Không thể thêm.");
                return;
            }
        }

        System.out.print("Nhập Họ tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập Tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập Chẩn đoán: ");
        String diagnosis = scanner.nextLine();

        patientList.add(new Patient(id, name, age, diagnosis));
        System.out.println("Tiếp nhận thành công!");
    }

    public static void updateDiagnosis() {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = scanner.nextLine();

        for (Patient p : patientList) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                String newDiagnosis = scanner.nextLine();
                p.setDiagnosis(newDiagnosis);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân!");
    }

    public static void dischargePatient() {
        System.out.print("Nhập ID cần xuất viện: ");
        String id = scanner.nextLine();

        Iterator<Patient> iterator = patientList.iterator();

        while (iterator.hasNext()) {
            Patient p = iterator.next();
            if (p.getId().equalsIgnoreCase(id)) {
                iterator.remove();
                System.out.println("Đã xuất viện bệnh nhân!");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân!");
    }

   
    public static void sortPatients() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p2.getAge() != p1.getAge()) {
                    return p2.getAge() - p1.getAge(); 
                }
                return p1.getFullName().compareToIgnoreCase(p2.getFullName()); 
            }
        });

        System.out.println("Đã sắp xếp danh sách!");
    }

    public static void displayPatients() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        for (Patient p : patientList) {
            System.out.println(p);
        }
    }
}
