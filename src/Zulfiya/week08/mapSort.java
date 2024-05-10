package Zulfiya.week08;

import java.util.*;

public class mapSort {
    public static void main(String[] args) {



        Map<String, Integer> result = unsortedMap(new TreeMap<>());
        System.out.println("result = " + result);


    }

    public static Map<String, Integer> unsortedMap(Map<String, Integer> sortedMap) {
        sortedMap.put("B32", 32);
        sortedMap.put("B33", 33);
        sortedMap.put("B31", 40);
        return sortedMap;

    }
}