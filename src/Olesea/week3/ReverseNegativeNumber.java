package Olesea.week3;

public class ReverseNegativeNumber {

        public static void main(String[] args) {

            int num = -35;
            revNegNum(num);
        }
        public static int revNegNum(int num){
            String str = String.valueOf(num);
            String reverse = "";
            for (int i = str.length()-1; i >=1 ; i--) {
                reverse += str.charAt(i)+"";
            }
            num = Integer.parseInt(reverse)*-1;
            System.out.println(num);
            return num;
        }

    }
