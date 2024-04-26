package Lisa.week08.task2;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 7, 0};
        moveZeros1(arr);
    }

    public static void moveZeros(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
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

    public static void moveZeros1(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index]=arr[i];
            }
        }
        System.out.println(Arrays.toString(result));

    }
}

