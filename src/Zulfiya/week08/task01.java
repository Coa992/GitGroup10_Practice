package Zulfiya.week08;

import java.util.ArrayList;
import java.util.Arrays;

public class task01 {
    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList<>(Arrays.asList(12,32,4,234));
        System.out.println(sorting(list));
    }
    public static ArrayList sorting(ArrayList<Integer> list){
        list=new ArrayList<>(Arrays.asList(12,32,4,234));
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size() ; j++) {
                if(list.get(j)>list.get(i)){
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);

                }
            }
        }
        return list;
        //System.out.println(list);
    }
    /*

1️⃣  ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method.

2️⃣  ArrayList - sorting in descending order
Write a method that can sort the ArrayList in Descending order without using the sort method.

3️⃣ Map - Sort the map by values
Write a method that can sort the Map by values.
     */
}
