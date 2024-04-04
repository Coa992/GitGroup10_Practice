package JahanaM.week7;

import java.util.Arrays;

public class SortArrayInAscendingOrder {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortAscending(10, 9, 8, 7,15,4)));
    }

    public static  int[]sortAscending(int... arr){
        for (int i=0; i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
