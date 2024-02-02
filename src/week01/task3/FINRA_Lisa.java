package week01.task3;

public class FINRA_Lisa {
    public static void main(String[] args) {
        finra();
    }
    public static void finra() {
        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if ( i % 3 == 0){
                System.out.println("FIN");
            } else if (i%5==0) {
                System.out.println("RA");
            }else {
                System.out.println(i);
            }
        }
    }
}
