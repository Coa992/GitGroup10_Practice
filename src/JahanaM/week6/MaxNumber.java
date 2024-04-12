package JahanaM.week6;

public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {100,20,500,40,-10,30};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {// i: 1,2,3,4,5
            if (numbers[i]>max){
                max =numbers[i];
            }
        }
        System.out.println("max = " +max);
    }
    }

