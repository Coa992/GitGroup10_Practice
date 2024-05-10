package Kimete.week05;



public class FindTheUnique {


        public static void main(String[] args) {

            String str =  "AAABBBCCCDEF";
            String uniques = "";

            for (int i = 0; i < str.length(); i++){
                char  ch = str.charAt(i);
                if (str.indexOf(ch) == str.lastIndexOf(ch)){
                    uniques += ch;
                }
            }


            System.out.println(uniques);


            // String - Find the unique
            // Write a return method that can find the unique characters from the
            // String  Ex: unique("AAABBBCCCDEF") ==> "DEF"
        }
    }


