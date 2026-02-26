import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai03 {
    public static void main(String[] args){
        List<Integer> listA1 = Arrays.asList(101,102,104,105);
        List<Integer> listB1 = Arrays.asList(102,105);
         
        List<Integer> common1 = new ArrayList<>();
        for (Integer item: listA1){
            if(listB1.contains(item) && !common1.contains(item)){
                common1.add(item);
            }
        }
        System.out.println("Test case 1 output: " + common1);

        List<String> listA2 = Arrays.asList("DN001", "DN002", "DN006");
        List<String> listB2 = Arrays.asList("DN004", "DN002");
        List<String> common2 = new ArrayList<>();
        for (String item : listA2){
            if(listB2.contains(item) && !common2.contains(item)){
                common2.add(item);
            }
        }
        System.out.println("Test case 2 output: "+ common2);
    }

}
