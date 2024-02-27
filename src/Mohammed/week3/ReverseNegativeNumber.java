package Mohammed.week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        int num = -35;
        int reverseNum = retNeg(num);

        System.out.println("reverseNum = " + reverseNum);
    }



    public static int retNeg(int number){

        int sign = number < 0 ? -1 : 1; // Save the sign of the number
        number = Math.abs(number); // Take the absolute value to reverse the digits
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }
        return reversedNumber * sign; // Apply the original sign to the reversed number
    }

}



/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */