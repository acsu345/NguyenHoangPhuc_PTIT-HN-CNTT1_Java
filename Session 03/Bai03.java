import java.util.ArrayList;

public class Bai03 {
    public static void main(String[] args) {
        String[] names = {"Python Pro", "Web Design", "Data Structure", "Java Basics", "AI Fundamentals"};
        int[] quantities = {50, 50, 5, 20, 5};
        findBooks(names, quantities, true);
        System.out.println("----------------");
        findBooks(names, quantities, false);
    }
    public static void findBooks(String[] names, int[] quantities, boolean findMax) {
        int extremeValue = findMax ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        ArrayList<String> books = new ArrayList<>();

        for (int i = 0; i < quantities.length; i++) {
            if ((findMax && quantities[i] > extremeValue) || (!findMax && quantities[i] < extremeValue)) {
                extremeValue = quantities[i];
                books.clear();
                books.add(names[i]);
            } else if (quantities[i] == extremeValue) {
                books.add(names[i]);
            }
        }
        String message = findMax ? "Sách có số lượng nhiều nhất (" + extremeValue + "):" : "Sách có số lượng ít nhất (" + extremeValue + "):";
        System.out.println(message);
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
}
