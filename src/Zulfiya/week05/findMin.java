package Zulfiya.week05;

public class findMin {
    public static void main(String[] args) {
        System.out.println( findMin( new int[]{32, 5, 6, 4}));
    }

//    Question1: Array - Find Minimum
//    Write a method that can find the minimum number from an int Array
 public static  int findMin(int[] numbers){

     int min = numbers[0];

     for (int eachElement : numbers) {
         if(eachElement<min){
             min=eachElement;
         }

     }
    return min;
    }


//    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class Ex: int[] arr = {10,20,7, 8, 90};
//    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
}
