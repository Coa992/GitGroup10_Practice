package Lisa.week03.task1;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(primeNumber(101));
    }

    public static boolean primeNumber(int num) {
        if (num % 2 != 0 && num % 3 != 0 && num > 0 || num == 2 || num == 3) {
            return true;
        } else {
            return false;
        }

    }
}
