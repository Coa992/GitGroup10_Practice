package Mohammed.week5;

import java.util.*;

public class FindTheUnique {
    public static String unique(String input) {
        Set<Character> unique = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!unique.contains(currentChar)) {
                unique.add(currentChar);
            } else {
                duplicates.add(currentChar);
            }
        }

        for (int i = 0; i < input.length(); i++){
            char currentChar = input.charAt(i);
            if (! duplicates.contains(currentChar)){
                result.append(currentChar);
            }
        }


        return result.toString();
    }


    public static void main(String[] args) {
       // System.out.println(unique(input)); // Output: DEF


        String input = "AAABBBCCCDEF";
        StringBuilder unique = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);
            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)){
                unique.append(currentChar);
            }
        }
        System.out.println(unique);

    }
}
