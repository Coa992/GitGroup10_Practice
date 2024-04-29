package Lisa.week08.task1;

import java.util.Arrays;

public class N_UniqueIntegers {
    public static void main(String[] args) {
        unique(10);
    }

    public static void unique(int n) {
        if(n<1||n>100){
            System.err.println("n should be between 1 and 100");
            System.exit(1);
        }

        int[] result = new int[n];
        for (int i = 0; i < n - 1; i++) {
            result[i] = i + 1;
        }
        result[n - 1] = -(n * (n - 1) / 2);
        System.out.println(Arrays.toString(result));
    }
}
