package Lisa.week06.task2;

import java.util.Arrays;
import java.util.Collections;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Maximum number = " + maximumNumber(new int[]{99, 12, 23, 32, 44, 57, 6}));
    }
    public static int maximumNumber(int[]arr){
        Arrays.sort(arr);
       return arr[arr.length-1];
    }
}
