import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bai02 {
    public static void main(String[] args){
         List<String> input = Arrays.asList(
                "Paracetamol",
                "Ibuprofen",
                "Panadol",
                "Paracetamol",
                "Aspirin",
                "Ibuprofen"
        );

          ArrayList<String> uniqueList = new ArrayList<>();

        for (String drug : input) {
            if (!uniqueList.contains(drug)) {
                uniqueList.add(drug);
            }
        }
          Collections.sort(uniqueList);

        System.out.println("Input: " + input);
        System.out.println("Output: " + uniqueList);
    }

}
