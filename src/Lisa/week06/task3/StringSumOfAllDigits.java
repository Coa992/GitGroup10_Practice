package Lisa.week06.task3;

import java.util.Arrays;

public class StringSumOfAllDigits {
    public static void main(String[] args) {
        System.out.println(sumOfAllDigits("12 java 5 apple 3"));
    }

    public static int sumOfAllDigits(String str) {
        int result = 0;
        String[] words = str.split(" ");
        for (String each : words) {
            if (Character.isDigit(each.charAt(0))) {
                result += Integer.parseInt(each);
            }
        }

        return result;
    }
}
