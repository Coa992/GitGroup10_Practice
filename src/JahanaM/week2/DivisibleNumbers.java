package JahanaM.week2;

public class DivisibleNumbers {
    public static void main(String[] args) {
        int num = 100;
        String by15 ="", by5="",by3="";

        for (int i = 1; i <=num ; i++) {
            if (i%15==0){
                by15+=i+" ";
            } else if (i%5==0) {
                by5+=i+" ";
            } else if (i%3==0) {
                by3+=i+" ";
            }
        }
        System.out.println("Divisible by 3: "+by3);
        System.out.println("Divisible by 5: "+by5);
        System.out.println("Divisible by 15: "+by15);
    }
}
