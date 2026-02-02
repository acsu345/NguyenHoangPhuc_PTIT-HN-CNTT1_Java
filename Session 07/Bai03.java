class ScoreUtils {
    public static boolean isPass(double score) {
        return score >= 5.0;
    }
    public static double average(double s1, double s2, double s3) {
        return (s1 + s2 + s3) / 3;
    }
};

public class Bai03 {
      public static void main(String[] args) {

        double a = 6.5;
        double b = 7.0;
        double c = 6.5;

        double avg = ScoreUtils.average(a, b, c);
        boolean pass = ScoreUtils.isPass(avg);

        System.out.println("Điem trung binh: " + avg);
        System.out.println("Ket qua: " + (pass ? "Pass" : "Fail"));
    }
}
