package Bai05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("Nguyen Van A", 10_000_000));
        employees.add(new ProductionEmployee("Tran Thi B", 300, 20_000));
        employees.add(new ProductionEmployee("Le Van C", 150, 30_000));

        double totalSalary = 0;

        System.out.println("Danh sách lương nhân viên:");

        int i = 1;
        for (Employee e : employees) {
            double salary = e.calculateSalary();
            totalSalary += salary;

            if (e instanceof OfficeEmployee) {
                System.out.println(i + ". " + e.getName()
                        + " (Office) - Lương: " + (long) salary);
            } else if (e instanceof ProductionEmployee) {
                ProductionEmployee p = (ProductionEmployee) e;
                System.out.println(i + ". " + e.getName()
                        + " (Production) - Lương: " + (long) salary
                        + " (" + p.getNumOfProducts() + " sản phẩm * "
                        + (long) p.getPrice() + ")");
            }
            i++;
        }

        System.out.println("\n=> TỔNG LƯƠNG CÔNG TY: " + (long) totalSalary);
    }
}
