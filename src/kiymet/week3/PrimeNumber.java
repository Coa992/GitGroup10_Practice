package kiymet.week3;public class PrimeNumber {    public static boolean isPrime(int number) {        if (number <= 1) {            return false;        }        if (number <= 3) {            return true;        }        if (number % 2 == 0 || number % 3 == 0) {            return false;        }        for (int i = 5; i * i <= number; i = i + 6) {            if (number % i == 0 || number % (i + 2) == 0) {                return false;            }        }        return true;    }    public static void main(String[] args) {        int number = 17; // Change this number to test for primality        if (isPrime(number)) {            System.out.println(number + " is a prime number.");        } else {            System.out.println(number + " is not a prime number.");        }    }}// Numbers -- PrimeNumber//Write a method that can check if a number is prime or not//// Numbers -- Reverse Negative Number//Write a return method that can reverse digits of a negative number and return it as int//input: -35  output: -53