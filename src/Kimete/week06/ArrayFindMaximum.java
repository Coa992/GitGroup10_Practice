package Kimete.week06;

public class ArrayFindMaximum {


        public static void main(String[] args) {
            int[] arr = {99, 12, 23, 32, 44, 57, 6};
            System.out.println(findMaximum(arr));
        }

        public static int findMaximum(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array must not be empty or null.");
            }

            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            return max;
        }
    }


