class Student {
    String studentId;
    String name;
    int yearOfBirth ;
    double gpa;

    public Student (){
        this.studentId = "";
        this.name = "";
        this.yearOfBirth= 0;
        this.gpa = 0.0;
    }

    public void displayInfo(){
        System.out.println("Student Id: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Year of Birth: "+ yearOfBirth);
        System.out.println("GPA: "+ gpa);
        System.out.println("------------------------");
    }

}

public class Bai01{
    public static void main(String[] args){
        Student student01 = new Student();
        student01.studentId = "BA001";
        student01.name = "Le Van B";
        student01.yearOfBirth = 2001;
        student01.gpa = 3.7;
        Student student02 = new Student();
        student02.studentId = "BA002";
        student02.name = "Nguyen Van A";
        student02.yearOfBirth = 2002;
        student02.gpa = 3.9;
        student01.displayInfo();
        student02.displayInfo();
    }
}