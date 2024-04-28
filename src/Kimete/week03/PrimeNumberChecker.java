package Kimete.week03;

public class PrimeNumberChecker {




        public static void main(String[] args) {
            int number = 17; // Example number to check

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        // Method to check if a number is prime
        public static boolean isPrime(int num) {
            // 0 and 1 are not prime numbers
            if (num <= 1) {
                return false;
            }

            // Check for divisibility by numbers up to the square root of the number
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false; // If divisible, it's not prime
                }
            }

            return true; // If not divisible by any number, it's prime
        }
    }



