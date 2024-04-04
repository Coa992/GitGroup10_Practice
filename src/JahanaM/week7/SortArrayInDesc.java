package JahanaM.week7;

import java.util.Arrays;

public class SortArrayInDesc {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortDesc(5,3,-2,15,11)));

    }
    public static  int[]sortDesc(int... arr){
        for (int i=0; i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
