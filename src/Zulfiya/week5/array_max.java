package Zulfiya.week5;

import java.util.Arrays;

public class array_max {
    public static void main(String[] args) {
        int maxResult = 0;
        System.out.println("first method "+ max_number(new int[]{99, 12, 23, 32, 44, 57, 6}));
        System.out.println("second method "+ (max_number(new int[]{99, 12, 23, 32, 44, 57, 6})));
    }
   public static int max_number(int[]max){
       int min = 0;
       for (int eachNum : max) {
           if (eachNum>min){
               min=eachNum;
           }
       }
       return min;
   }
   public static int max_num2(int[]max2){

       Arrays.sort(max2);

   return max2[max2.length-1];
   }

}
