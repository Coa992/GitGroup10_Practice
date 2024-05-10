package Zulfiya.week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class week07 {
    public static void main(String[] args) {
        List<Integer>removeValue = new ArrayList<>(Arrays.asList(65,98,566,5,680));
        for (int i = 0; i < removeValue.size(); i++) {
           if( removeValue.get(i)>100){
               removeValue.remove(i);
           }

        }
        System.out.println("removeValue = " + removeValue);



        List<Integer>removeValue2 = new ArrayList<>(Arrays.asList(12,928,66,5,680,33));
        removeValue2.removeIf(p-> p >100);
        System.out.println("removeValue2 = " + removeValue2);
     /*

3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
         */
    }
}


