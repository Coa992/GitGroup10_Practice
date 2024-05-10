package Lisa.week10.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSortingDescending {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(7, 4, 9, 0, 2));
        sortArrayList(list);
        System.out.println(list);

    }


    public static void sortArrayList(ArrayList<Integer> arrList) {

        for (int i = 1; i < arrList.size(); i++) {
            for (int j = 0; j < arrList.size() - i; j++) {
                if (arrList.get(j) < arrList.get(j+1)) {
                    int hold = arrList.get(j);
                    arrList.set(j, arrList.get(j + 1));
                    arrList.set((j + 1), hold);
                }
            }
        }
    }



}
