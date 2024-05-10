package Zulfiya.week09;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class frequencyMap {
    public static void main(String[] args) {
        String str = "fyyyrr";
        Map<Character, Integer> result = map(str);
        System.out.println("result = " + result);
    }
public static Map<Character,Integer>map(String str){
    Map<Character, Integer> map = new LinkedHashMap<>();
        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if (frequency >=1)
                map.put(each.charAt(0), frequency);
        }
        return map;
                }


    }

