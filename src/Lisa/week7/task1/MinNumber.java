package Lisa.week7.task1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr={4,7,8,9};
        System.out.println(minNumber(arr));
    }
    public static int minNumber(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
