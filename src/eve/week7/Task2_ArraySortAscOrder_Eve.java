package eve.week7;

public class Task2_ArraySortAscOrder_Eve {

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 9, 1};
        int[] sortedArr = sortArray(arr);
        for (int num : sortedArr) {    //printing the sorted array with using for each loop
            System.out.print(num + " ");
        }
    }
}



