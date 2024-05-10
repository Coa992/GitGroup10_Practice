package JahanaM.week7;

public class MinNumberArray {
    public static void main(String[] args) {
        int[] numbers = {100,20,500,40,-10,30,-50};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {// i: 1,2,3,4,5
            if (numbers[i]<min){
                min =numbers[i];
            }
        }
        System.out.println("min = " +min);
    }
}

