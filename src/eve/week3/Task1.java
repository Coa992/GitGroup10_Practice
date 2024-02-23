package eve.week3;

public class Task1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        a = a + b; // 5+2=7 now a = 7, but b still is 5
        b = a - b; // 7-5=2 now b = 2, but a still is 7
        a = a - b; // 7-2 = 5 now a = 5

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
        //Solution 2:
public static void swaptwonumbers2(int a, int b){

//here a and b should not be 0

a = a*b;
b = a/b;
a = a/b;
         */
    }
}
