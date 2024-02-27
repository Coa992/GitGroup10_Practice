package Lisa.week02.task3;

import java.util.Scanner;

public class CodilityTestCoders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(codility(n));
    }

    public static String codility(int n) {
        String result = "";
        String a2 = "Codility";
        String a3 = "Test";
        String a5 = "Coders";

        for (int i = 1; i <= n; i++) {
             result = "";
            if (i % 2 == 0) {
                result += a2;
            }
            if (i % 3 == 0) {
                result += a3;
            }
            if (i % 5 == 0) {
                result += a5;
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
                continue;
            }
            System.out.println(result);

        }
        return result;
    }
}
/*
Numbers -- print consecutive numbers
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N,
each on a separate line.
However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or
Coders respectively.
If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a
concatenation of
the respective words Codility, Test and Coders in this given order. For example,
 numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all
  three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

For example, here is the output for N = 17:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
*/