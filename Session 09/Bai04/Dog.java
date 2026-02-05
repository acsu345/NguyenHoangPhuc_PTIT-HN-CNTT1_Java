package Bai04;

public class Dog extends Animal {
      @Override
    public void sound() {
        System.out.println("Chó sủa: Gâu gâu");
    }

    public void bite() {
        System.out.println("Chó đang cắn");
    }
}
