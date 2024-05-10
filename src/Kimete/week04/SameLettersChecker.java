package Kimete.week04;
import java.util.Arrays;

public class SameLettersChecker {

        public static void main(String[] args) {
            String str1 = "abc";
            String str2 = "cab";

            if (areSameLetters(str1, str2)) {
                System.out.println("The strings are built out of the same letters.");
            } else {
                System.out.println("The strings are not built out of the same letters.");
            }
        }

        public static boolean areSameLetters(String str1, String str2) {
            // Sort both strings
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare the sorted strings
            return Arrays.equals(arr1, arr2);
        }



}
