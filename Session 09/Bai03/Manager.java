package Bai03;

public class Manager extends Employee{
      private String department;

    public Manager(String name, double basicSalary, String department) {
        super(name, basicSalary);   // PHẢI là dòng đầu tiên
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phòng ban: " + department);
    }
}
