package Mohammed.week4;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String str = "AAABBBCCC";
        System.out.println(str + " after removeDup = " + removeDup(str));


    }

    /*
    private static String removeDuplicates(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++ ) {
            char currentChar = str.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1){
                result.append(currentChar);
            }
        }
        return result.toString();
    }

     */


    public static String removeDup(String str){

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        String result = "";

        for (int i = 0; i <str.length(); i++){
            char currentChar = str.charAt(i);
            if ( ! set.contains(currentChar)){
                result += currentChar;
                set.add(currentChar);
            }
        }

        return result;

    }

}



/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */