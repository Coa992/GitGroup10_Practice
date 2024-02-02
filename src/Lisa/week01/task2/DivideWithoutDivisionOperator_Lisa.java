package Lisa.week01.task2;

import java.util.Scanner;

public class DivideWithoutDivisionOperator_Lisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //Dividend
        int b = scanner.nextInt(); //Divisor
        System.out.println(divideWithoutDivision(a, b));//result
    }

    public static int divideWithoutDivision(int a, int b) {
        int result = 0;
        int c = a;
        if (b == 0) {
            System.err.println("Can't divide by 0");
            System.exit(1);
        } else if (a == 0) { //If number divided by 0, result is always equals 0
            return result;

        }
        if (a > 0 && b > 0 && a > b) { //logic for numbers greater then 0
            for (int i = 0; i < c; i++) { //c is not going to decrease its value as variable a
                a = a - b;//difference(how many times we can iterate before a is less than 0)
                result++;
                if (a <= 0) {
                    return result;
                }
            }
        }
        if (a < 0 && b < 0) {
            b = b * -1;//module of b
            a = a * -1;//module of a
            c = a;
            for (int i = 0; i < c; i++) {
                a = a - b;
                result++;
                if (a <= 0) {
                    return result;
                }
            }
        }
        if (b < 0) {
            b = b * -1;
            for (int i = 0; i < c; i++) {

                a = a - b;
                result++;
                if (a <= 0) {
                    result = result * -1;
                    return result;
                }
            }
        }
        if (a < 0) {

            a = a * -1;
            c = a;
            for (int i = 0; i < c; i++) {
                a = a - b;
                result++;
                if (a <= 0) {
                    result = result * -1;
                    return result;
                }
            }
        }
        return result;
    }
}
