package Lisa.week7.task3;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 8};
        desc(arr);
    }

    public static void desc(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int hold = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = hold;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        System.out.println(Arrays.toString(result));
    }

}
