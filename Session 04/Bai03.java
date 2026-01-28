import java.time.LocalDate;

public class Bai03 {
        public static void main(String[] args) {

        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        long start1 = System.currentTimeMillis();

        String report1 = "";
        report1 += "--- BAO CAO MUON SACH ---\n";
        report1 += "Ngay tao: " + LocalDate.now() + "\n";

        for (int i = 0; i < transactions.length; i++) {
            report1 += "Giao dich: " + transactions[i] + "\n";
        }

        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();

        StringBuilder report2 = new StringBuilder();
        report2.append("--- BAO CAO MUON SACH ---\n");
        report2.append("Ngay tao: ").append(LocalDate.now()).append("\n");

        for (int i = 0; i < transactions.length; i++) {
            report2.append("Giao dich: ").append(transactions[i]).append("\n");
        }

        long end2 = System.currentTimeMillis();

        System.out.println(report2.toString());

        System.out.println("So thoi gian thuc thi doi voi StringBuilder: " + (end2 - start2));
        System.out.println("So thoi gian thuc thi doi voi String: " + (end1 - start1));
    }
}
