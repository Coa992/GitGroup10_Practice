package eve.week8;

public class TAsk2_MoveZeroToEnd_Eve {
    public static void moveZerosToEnd(int[] arr) {
        int zerosCount = 0;

        // Count the number of zeros in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zerosCount++;
            }
        }

        int index = 0;

        // Move all non-zero elements to the front of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill the remaining indexes with zeros
        while (zerosCount > 0) {
            arr[index] = 0;
            index++;
            zerosCount--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 2, 0, 8, 0};
        //moveZeros(arr);
        moveZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
