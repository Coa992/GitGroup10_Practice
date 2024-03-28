package eve.week7;

public class Task1_FindMinInArray_Eve {
    public static int minValue( int[]  n ) {
       // int min = Integer.MAX_VALUE;
        int min = n[0]; //Assume the first element is minimum
        for(int each: n)
            if(each < min)
                min = each;

        return min;
    }
    public static void main(String[] args) {
        int[] n = {5, 2, 9, -1, 7, -3};
        int minValue = minValue(n);
        System.out.println("Minimum number: " + minValue);
    }
}
