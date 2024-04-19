package Lisa.week9.task3;

import java.util.ArrayList;
import java.util.List;

/*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */
public class RemoveSomeValues {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 150; i++) {
            list.add(i);
        }

        list.removeIf(p ->p>=100);

        System.out.println(list);

    }
}
