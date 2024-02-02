package Mohammed.week1;

import java.util.Scanner;

public class Task1_OddOrEven {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();

        if (num %2 == 0){
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

    }
}


/*
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */