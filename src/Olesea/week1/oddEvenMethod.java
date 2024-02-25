package Olesea.week1;

public class oddEvenMethod {
    public static void main(String[] args) {
        oddEven(6);
    }

    public static int oddEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        return num;
    }
}
