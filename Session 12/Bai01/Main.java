package Bai01;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args){
        ArrayList<Double> list = new ArrayList<>();
        list.add(36.5);
        list.add(40.2);
        list.add(37.0);
        list.add(12.5);
        list.add(39.9);
        list.add(99.9);
        list.add(36.8);
        System.out.println("Danh sách nhiệt độ ban đầu:" + list);

        Iterator<Double> iterator = list.iterator();
        while(iterator.hasNext()){
            Double value = iterator.next();
            if(value < 34.0 || value > 42.0){
                iterator.remove();
            }
        }
        System.out.println("Danh sách nhiệt độ sau khi loại bỏ các giá trị nhỏ hơn 34 và lớn hơn 42: " + list);

    double tong = 0;
    for (Double value : list){
        tong += value ;
    }
    double trungBinh = tong / list.size();
    System.out.println("Nhiệt độ trung bình: " + trungBinh);
    }
}
