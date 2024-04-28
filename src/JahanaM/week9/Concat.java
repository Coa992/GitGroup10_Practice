package JahanaM.week9;

import java.util.Arrays;

public class Concat {
    public static void main(String[] args) {
        int[]array1={1,8,9};
        int[]array2={2,6,11,17};
        System.out.println(Arrays.toString(concatArrays(array1,array2)));
    }



    public  static int[]concatArrays(int[]array1,int[]array2) {
        int[] merged = new int[array1.length + array2.length];
        for (int i = 0, y = 0; i < merged.length; i++) {
            if (i < array1.length) {
                merged[i] = array1[i];
            } else {
                merged[i] = array2[y++];
            }
        }
        return merged;
    }
}
