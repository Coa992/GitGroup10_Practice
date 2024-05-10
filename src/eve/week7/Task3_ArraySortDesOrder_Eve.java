package eve.week7;

public class Task3_ArraySortDesOrder_Eve {

    public static int[] sortArrayDescending(int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1};

        // Call the sortArrayDescending method
        int[] sortedArr = sortArrayDescending(arr);

        // Print the sorted array
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}
