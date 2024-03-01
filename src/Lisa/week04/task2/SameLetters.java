package Lisa.week04.task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SameLetters {
    /*
    Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false

     */
    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cab"));
    }
    public static boolean sameLetters(String str1,String str2){
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);

        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            return true;
        }
        return false;
    }

}
