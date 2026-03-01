import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Bai03 {
     public static void main(String[] args) {

        Set<String> drug = new HashSet<>(Arrays.asList(
                "Aspirin", "Caffeine", "Paracetamol"
        ));

        Set<String> allergy = new HashSet<>(Arrays.asList(
                "Penicillin", "Aspirin"
        ));

        Set<String> warning = new HashSet<>(drug);
        warning.retainAll(allergy);

        Set<String> safe = new HashSet<>(drug);
        safe.removeAll(allergy);

        System.out.println("Cảnh báo dị ứng: " + warning);
        System.out.println("Thành phần an toàn: " + safe);
    }
}
