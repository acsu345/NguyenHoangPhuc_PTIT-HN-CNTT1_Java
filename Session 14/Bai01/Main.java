package Bai01;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> patients = new LinkedHashSet<>();

        List<String> input = Arrays.asList(
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        );

        patients.addAll(input);

        for (String name : patients) {
            System.out.print(name + ", ");
        }
    }
}
