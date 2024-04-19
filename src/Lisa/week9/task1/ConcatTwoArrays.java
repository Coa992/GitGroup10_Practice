package Lisa.week9.task1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        concatArrays(array1, array2);
    }

    public static int[] concatArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[i+arr1.length] = arr2[i];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
