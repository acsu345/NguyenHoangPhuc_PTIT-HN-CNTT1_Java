package Bai06;

import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static List<Medicine> medicineList = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== MENU KE DON THUOC =====");
            System.out.println("1. Them thuoc vao don");
            System.out.println("2. Dieu chinh so luong");
            System.out.println("3. Xoa thuoc");
            System.out.println("4. In hoa don");
            System.out.println("5. Tim thuoc gia re (< 50.000)");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    deleteMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapMedicine();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);
    }

    static void addMedicine() {
        System.out.print("Nhap ma thuoc: ");
        String id = scanner.nextLine();

        for (Medicine m : medicineList) {
            if (m.getDrugId().equalsIgnoreCase(id)) {
                System.out.print("Thuoc da ton tai. Nhap so luong them: ");
                int qty = scanner.nextInt();
                scanner.nextLine();
                m.setQuantity(m.getQuantity() + qty);
                System.out.println("Da cong them so luong!");
                return;
            }
        }

        System.out.print("Nhap ten thuoc: ");
        String name = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        double price = scanner.nextDouble();
        System.out.print("Nhap so luong: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        medicineList.add(new Medicine(id, name, price, quantity));
        System.out.println("Da them thuoc moi!");
    }

    static void updateQuantity() {
        while (true) {
            System.out.print("Nhap ma thuoc can dieu chinh: ");
            String id = scanner.nextLine();

            Medicine found = null;
            for (Medicine m : medicineList) {
                if (m.getDrugId().equalsIgnoreCase(id)) {
                    found = m;
                    break;
                }
            }

            if (found == null) {
                System.out.println("Khong tim thay thuoc! Vui long nhap lai.");
            } else {
                System.out.print("Nhap so luong moi: ");
                int newQty = scanner.nextInt();
                scanner.nextLine();

                if (newQty == 0) {
                    medicineList.remove(found);
                    System.out.println("Thuoc da bi xoa khoi don.");
                } else {
                    found.setQuantity(newQty);
                    System.out.println("Da cap nhat so luong!");
                }
                break;
            }
        }
    }

    static void deleteMedicine() {
        System.out.print("Nhap ma thuoc can xoa: ");
        String id = scanner.nextLine();

        Iterator<Medicine> iterator = medicineList.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Medicine m = iterator.next();
            if (m.getDrugId().equalsIgnoreCase(id)) {
                iterator.remove();
                found = true;
                System.out.println("Da xoa thuoc!");
                break;
            }
        }

        if (!found) {
            System.out.println("Khong ton tai thuoc voi ma nay!");
        }
    }

    static void printInvoice() {
        if (medicineList.isEmpty()) {
            System.out.println("Don thuoc dang rong!");
            return;
        }

        double total = 0;

        System.out.println("\n===== HOA DON =====");
        System.out.printf("%-10s %-20s %-10s %-10s %-15s\n",
                "Ma", "Ten", "Gia", "SL", "Thanh tien");

        for (Medicine m : medicineList) {
            double lineTotal = m.getTotalPrice();
            total += lineTotal;

            System.out.printf("%-10s %-20s %-10.0f %-10d %-15.0f\n",
                    m.getDrugId(),
                    m.getDrugName(),
                    m.getUnitPrice(),
                    m.getQuantity(),
                    lineTotal);
        }

        System.out.println("----------------------------------------------");
        System.out.println("Tong tien: " + total + " VND");

        medicineList.clear();
        System.out.println("Don thuoc da duoc reset cho lan sau.");
    }

    static void findCheapMedicine() {
        boolean found = false;

        System.out.println("\n===== THUOC GIA RE (< 50.000) =====");

        for (Medicine m : medicineList) {
            if (m.getUnitPrice() < 50000) {
                System.out.println(m.getDrugName() + " - " + m.getUnitPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong co thuoc nao duoi 50.000 VND.");
        }
    }
}