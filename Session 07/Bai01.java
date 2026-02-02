class Student {
    private String name ;
    private String id;

    private static int totalStudent = 0;

    public static int getTotalStudent() {
        return totalStudent;
    }

    public Student(String name, String id){
        this.name = name;
        this.id = id ;
        totalStudent++;
    }

    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ id);
    }
}
public class Bai01 {
    public static void main(String[] args){
        Student stu1 = new Student("Nguyen Van A", "SV001");
        Student stu2 = new Student("Tran Thi B", "SV002");
        stu1.display();
        stu2.display();
        System.out.println("Total students: "+ Student.getTotalStudent());
    }
}
