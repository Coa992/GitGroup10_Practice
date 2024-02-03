package Lisa.week02.task3;

import java.util.Scanner;

public class CodilityTestCoders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String a2 = "Codility";
        String a3 = "Test";
        String a5 = "Coders";

        for (int i = 1; i <= n; i++) {
            String result = "";
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
    }
}
