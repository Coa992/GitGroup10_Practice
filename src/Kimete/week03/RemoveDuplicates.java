package Kimete.week03;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {


    public static void main(String[] args) {
            String str = "AAABBBCCC";
            String result = removeDuplicates(str);
            System.out.println("Original string: " + str);
            System.out.println("String after removing duplicates: " + result);
        }

        public static String removeDuplicates(String str) {
            // LinkedHashSet maintains the order of insertion
            Set<Character> uniqueChars = new LinkedHashSet<>();

            // Add each character of the string to the set
            for (char c : str.toCharArray()) {
                uniqueChars.add(c);
            }

            // Construct the string from the unique characters in the set
            StringBuilder sb = new StringBuilder();
            for (char c : uniqueChars) {
                sb.append(c);
            }

            return sb.toString();
        }
    }






