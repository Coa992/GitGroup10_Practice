package Zulfiya.week09;

import java.util.Map;
import java.util.TreeMap;

public class minValueOfMap {
    public static void main(String[]args){
        Map<String,Integer>result = mapMethod(new TreeMap<>());
        System.out.println(result);
    }

    public static Map<String,Integer>mapMethod(Map<String,Integer>map){
        map.put("B32", 32);
        map.put("B33", 33);
        map.put("B31", 21);


        return map;
    }
}
