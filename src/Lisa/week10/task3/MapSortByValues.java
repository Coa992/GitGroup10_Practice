package Lisa.week10.task3;

import java.util.*;

public class MapSortByValues {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        map.put(3, 10);
        map.put(2, 70);
        map.put(9, 60);
        map.put(1, 10);
        map.put(7, 50);
        map.put(0, 30);
        SortMap(map);
        System.out.println(map);

    }

    public static void SortMap(Map<Integer, Integer> map) {

        List<Integer> sortedValues = new ArrayList<>(map.values());

        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();

        Collections.sort(sortedValues);

        int indexOfList = 0;

        for (Map.Entry<Integer, Integer> eachEntrySet : map.entrySet()) {
            sortedMap.put(eachEntrySet.getKey(), eachEntrySet.setValue(sortedValues.get(indexOfList)));
            indexOfList++;

        }
    }
}





