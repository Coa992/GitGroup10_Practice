package Lisa.week10.task3;

import java.util.*;

public class MapSortByValues {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(3, 10);
        map.put(2, 70);
        map.put(9, 60);
        map.put(1, 90);
        map.put(7, 50);
        map.put(8, 30);


        SortMap(map);


    }

    public static void SortMap(Map<Integer, Integer> map) {
        Map<Integer, Integer> swappedMap = new TreeMap<>();//maintains ascending order
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println(swappedMap);

        Map<Integer, Integer> sortedByValue=new LinkedHashMap<>();//keeps the insertion order
        for (Map.Entry<Integer, Integer> eachEntry : swappedMap.entrySet()) {
            sortedByValue.put(eachEntry.getValue(), eachEntry.getKey());
        }
        System.out.println(sortedByValue);
    }

}





