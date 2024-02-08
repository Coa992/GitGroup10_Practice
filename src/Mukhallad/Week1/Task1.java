package Mukhallad.Week1;

public class Task1 {


    public static String idOddEven(int n) {
        return n % 2 == 0 ? "Even" : "Odd";


    }

    public static void main(String[] args) {
        String r1 = idOddEven(5);
        System.out.println(r1);


        String r2 = idOddEven(6);
        System.out.println(r2);
    }

}

   /*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"

     */




