package Bai03;

public class Employee {
      protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void display() {
        System.out.println("Tên: " + name);
        System.out.println("Lương cơ bản: " + basicSalary);
    }
}
