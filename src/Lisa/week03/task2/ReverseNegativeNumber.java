package Lisa.week03.task2;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reversNegativeNumbers(-20));
    }

    public static int reversNegativeNumbers(int negativeN) {
        if (negativeN > -10 || negativeN < -98) {
            System.out.println("Negative number must be 2 digits only");
            System.exit(1);
        }
            return negativeN % 10 * 10 + negativeN / 10;
    }
}
