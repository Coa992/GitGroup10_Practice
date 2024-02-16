package Mohammed.week2;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        a = a + b;    // a = 10 + 20  == 30
        b = a - b;    // b = 30 - 20  == 10
        a = a - b;    // a = 30 - 10  == 20

        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}



//Swap two variable values without using a third variable