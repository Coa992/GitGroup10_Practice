package JahanaM.Week8;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(move(8,1,0,9,4,0,0,2)));
    }


    public static  int[]move(int...nums){
        int[]moved=new int[nums.length];
        int index = 0;
        for(int each : nums){
            if(each!=0){
                moved[index++]=each;
            }
        }

        return moved;
    }
}
