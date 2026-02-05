package Bai06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(6));

        double totalArea = 0;
        int i = 1;

        System.out.println("Kết quả tính toán hình học:\n");

        for (Shape s : shapes) {
            double area = s.calculateArea();
            totalArea += area;

            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.printf("%d. Hình tròn (r=%.1f) - Diện tích: %.2f\n\n",
                        i, c.getRadius(), area);
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                if (r.getWidth() == r.getHeight()) {
                    System.out.printf("%d. Hình vuông (cạnh %.1f) - Diện tích: %.2f\n\n",
                            i, r.getWidth(), area);
                } else {
                    System.out.printf("%d. Hình chữ nhật (%.1f x %.1f) - Diện tích: %.2f\n\n",
                            i, r.getWidth(), r.getHeight(), area);
                }
            }
            i++;
        }

        System.out.printf("=> Tổng diện tích các hình: %.2f", totalArea);
    }
}
