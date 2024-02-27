package Mohammed.week3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        while (true){
            System.out.println("Enter a number: ");
            int input = new Scanner(System.in).nextInt();

            boolean isPrime = isPrime(input);

            if(isPrime){
                System.out.println(input + " is a prime number");
            } else {
                System.err.println(input + " is not a prime number");
            }

        }


    }

    public static boolean isPrime(int number){
        if (number % 2 ==0 && number != 2){
            return false;
        }
        if (number < 0){
            return false;
        }

        return true;
    }
}


//Write a method that can check if a number is prime or not