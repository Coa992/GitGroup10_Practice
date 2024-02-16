package JahanaM.week2;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
consecutiveNumber(35);
    }
    public static void consecutiveNumber(int n){

        for (int i = 0; i<=n;i++){
            String result  ="";
            if (i%2==0){
                result +="Codility";
            }
            if (i%3==0){
                result +="Test";
            }
            if (i%5==0){
                result +="Coders";
            }
            System.out.println(result.isEmpty()?i:result);
        }
    }
}
