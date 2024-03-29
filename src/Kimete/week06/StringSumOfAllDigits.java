package Kimete.week06;

public class StringSumOfAllDigits {

        public static void main(String[] args) {
            String str = "12 java 5 apple 3";
            System.out.println(sumOfAllDigits(str));
        }

        public static int sumOfAllDigits(String str) {
            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isDigit(ch)) {
                    int digit = Character.getNumericValue(ch);
                    sum += digit;
                }
            }

            return sum;
        }
    }


