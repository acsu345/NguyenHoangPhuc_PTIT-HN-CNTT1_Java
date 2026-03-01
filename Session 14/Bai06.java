import java.util.*;

class Patient {
    String name;
    int age;
    String department;

    public Patient(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Bai06 {
    public static void main(String[] args) {

        List<Patient> patients = Arrays.asList(
                new Patient("Lan", 45, "Tim mạch"),
                new Patient("Hùng", 50, "Nội tiết"),
                new Patient("Mai", 30, "Tim mạch")
        );

        Map<String, List<Patient>> map = new HashMap<>();

        for (Patient p : patients) {
            if (!map.containsKey(p.department)) {
                map.put(p.department, new ArrayList<>());
            }
            map.get(p.department).add(p);
        }

        for (String dept : map.keySet()) {
            System.out.println("Khoa " + dept + " -> " + map.get(dept));
        }

        String maxDept = "";
        int maxSize = 0;

        for (Map.Entry<String, List<Patient>> entry : map.entrySet()) {
            if (entry.getValue().size() > maxSize) {
                maxSize = entry.getValue().size();
                maxDept = entry.getKey();
            }
        }

        System.out.println("Khoa " + maxDept + " đang đông nhất (" + maxSize + " bệnh nhân)");
    }
}