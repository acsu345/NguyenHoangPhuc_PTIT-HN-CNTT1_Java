class Config {
    public static final int MAX_SCORE = 10;
    public static final int MIN_SCORE = 0;
}

public class Bai05 {
    
       public static void main(String[] args) {

        int score = 8;

        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ");
        } else {
            System.out.println("Điểm không hợp lệ");
        }
    }
}
