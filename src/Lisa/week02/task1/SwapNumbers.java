package Lisa.week02.task1;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println(swap(3, 5));
    }

    public static String swap(int a, int b) {

        a = a + b;//a=8
        b = a - b;//b=3;
        a = a - b;//a=5;
        String result = "a = " + a + ", b = " + b;

        return result;
    }


}
