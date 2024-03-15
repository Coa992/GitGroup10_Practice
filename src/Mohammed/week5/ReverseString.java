package Mohammed.week5;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {



        //String reverse = "ABCD";

        System.out.println("Enter something: ");
        String input = new Scanner(System.in).nextLine();


        StringBuilder result = new StringBuilder();

        for (int i = input.length()-1; i >= 0; i--) {
            result.append(input.charAt(i));

        }



        System.out.println(result);

    }

}


/*
String -- Reverse
Write a function that can reverse a String
Ex: Reverse("ABCD"); ==> DCBA *

 */