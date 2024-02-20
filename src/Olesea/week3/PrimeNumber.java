package Olesea.week3;

import java.util.Scanner;

public class PrimeNumber {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        isPrimer(num);

    }
    public static int isPrimer(int num){
        boolean prime = false;
        for (int i = 2; i < num ; i++) {
            if (num % i == 0 && num!=i) {
                prime = true;
                break;
            }else{
                prime = false;
            }
        }
        if(!prime){
            System.out.println(num + " is Prime Number");
        }else{
            System.out.println(num + " is not Prime Number");
        }
        return num;
    }
}
