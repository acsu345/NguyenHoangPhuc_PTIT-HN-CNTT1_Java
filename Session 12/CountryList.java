import java.util.ArrayList;
import java.util.Scanner;

public class CountryList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> countries = new ArrayList<>();
        System.out.println("Nhập tên quốc gia bất kì: ");
        while(true){
            String input = sc.nextLine();

            if(input.length() == 1){
                break;
            }
            countries.add(input);
        }
        System.out.println("Danh sách quốc gia đã nhập: ");
        for(String country: countries){
            System.out.println(country);
        }
    }
}
