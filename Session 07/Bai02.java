class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Bai02 {
        public static void main(String[] args) {
        int a = 10;      // a lưu trữ dữ liệu là 10
        int b = a;       // b sao chép dữ liệu của a

        b = 20;          // thay đổi b nhưng không ảnh hưởng đến a

        System.out.println("Primitive variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Student s1 = new Student("An"); // tạo object ở trong  heap
        Student s2 = s1;                // s2 sao chép địa chỉ của s1
        s2.name = "Binh";             

        System.out.println("Reference variable:");
        System.out.println("s1.name = " + s1.name); 
        System.out.println("s2.name = " + s2.name); 
        }
}
