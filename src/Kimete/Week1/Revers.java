package Kimete.Week1;

public class Revers {
    public static void main(String[] args) {

        String name = "Krasniqi";
            String result  = "";

            for (int i = name.length() - 1; i >= 0; i--) {
                result = result + name.charAt(i);

            }

            System.out.println(result);


    }
}
