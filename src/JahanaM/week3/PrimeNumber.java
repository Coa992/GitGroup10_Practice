package JahanaM.week3;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(17));
        System.out.println(isPrime(10));
    }




    public static boolean isPrime(int n){
        for(int i = 2;i<n;i++)
            if (n%i==0){
                return false;
            }
        return true;
    }
}
