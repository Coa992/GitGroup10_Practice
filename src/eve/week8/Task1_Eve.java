package eve.week8;

import java.util.Arrays;

public class Task1_Eve {

    public static int[] Solution(int N) {
        int[] result = new int[N];  //  an integer array of size N.
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            result[i] = i;  //  assigns each element the value of the loop index
            sum += i; // 3 calculates the cumulative sum of the elements.
        }
        result[N - 1] = -sum; //3  After iterating through all indexes except the last one, it assigns the last element the negative value of the sum
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution(6)));

    }
}

