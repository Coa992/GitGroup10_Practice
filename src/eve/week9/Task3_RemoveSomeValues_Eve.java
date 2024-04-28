package eve.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_RemoveSomeValues_Eve {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int  each : list1)
            if( each < 100)
                list2.add(each);

        list1=list2;
        System.out.println(list1);

        System.out.println();
        System.out.println("------------------");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        list.removeIf(p -> p>100);
        System.out.println(list);


    }
    }

