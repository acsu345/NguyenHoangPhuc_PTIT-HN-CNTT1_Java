class ClassRoom {
    static int classFund = 0;
    String studentName;
    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }
    public void contribute(int amount) {
        classFund += amount;
        System.out.println(studentName + " đóng " + amount + " => Quỹ lớp: " + classFund);
    }
    public static void showFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}

public class Bai04 {
     public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("An");
        ClassRoom s2 = new ClassRoom("Bình");
        ClassRoom s3 = new ClassRoom("Chi");

        s1.contribute(100);
        s2.contribute(200);
        s3.contribute(150);

        ClassRoom.showFund();
    }
}
