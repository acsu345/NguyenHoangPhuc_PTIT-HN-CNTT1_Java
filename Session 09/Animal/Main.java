package Animal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BirdAnimal bird = new BirdAnimal();
        MamalAnimal mamal = new MamalAnimal();

        System.out.println("===== Nhập thông tin CHIM =====");
        bird.input();

        System.out.println("\n===== Nhập thông tin THÚ =====");
        mamal.input();

        System.out.println("\n===== Thông tin CHIM =====");
        bird.display();

        System.out.println("\n===== Thông tin THÚ =====");
        mamal.display();
    }
}