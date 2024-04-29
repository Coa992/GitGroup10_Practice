package Lisa.week11.task2;

import Lisa.week07.task1.MinNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MapMinValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Anna", 10);
        map.put("Boris", 70);
        map.put("Carol", 60);
        map.put("Donna", 90);
        map.put("Eve", 50);
        map.put("Frank", 30);


        System.out.println("min(map) = " + min(map));
    }
    public static int min(Map<String,Integer> map){
        int result=2147483647;
        ArrayList<Integer> arr = new ArrayList<>();

        for (Map.Entry<String, Integer> eachEntrySet : map.entrySet()) {
            arr.add(eachEntrySet.getValue());
        }

        //result = Collections.min(arr);

        for (Integer each : arr) {
            if(each<result){
                result=each;
            }
        }

        return result;
    }

}
