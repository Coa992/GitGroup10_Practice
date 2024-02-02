package Lisa.week01.task1;

public class OddOrEven_Lisa {
    public static void main(String[] args) {
        boolean result = oddOrEven(9);
        System.out.println(result);
    }

    public static boolean oddOrEven(int n) {
        if (n % 2 == 0) {//Divided without remainder
            return true;
        } else return false;
    }
}
