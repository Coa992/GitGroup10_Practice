package Kimete.week05;


public class StringReverse {

        public static void main(String[] args) {

            String input = "ABCD";
            String result = "";


            for (int i = input .length() - 1; i >= 0; i--) {
                result = result + input.charAt(i);
            }

            System.out.println(result);

        }
        //Write a function that can reverse a String
        // Ex: Reverse("ABCD"); ==> DCBA *
    }


