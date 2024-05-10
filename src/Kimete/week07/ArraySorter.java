package Kimete.week07;

public class ArraySorter {

        public static void main(String[] args) {
            int[] arr = {10, 9, 8, 7};
            arr = sort(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        public static int[] sort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {

                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            return arr;
        }
    }



