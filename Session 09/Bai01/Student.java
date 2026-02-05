package Bai01;

public class Student extends Person {
      private String studentId;
    private double gpa;

    public Student(String fullName, int age, String studentId, double gpa) {
        super(fullName, age);  
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display(); 
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + gpa);
    }
}
