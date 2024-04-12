package Kimete.week03;

import java.util.HashMap;
import java.util.Map;

public class SameLettersChecker {


        public static void main(String[] args) {
            String str1 = "abc";
            String str2 = "cab";

            if (areSameLetters(str1, str2)) {
                System.out.println("The strings are built out of the same letters.");
            } else {
                System.out.println("The strings are not built out of the same letters.");
            }
        }

        public static boolean areSameLetters(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false; // If lengths are different, strings can't be made of same letters
            }

            Map<Character, Integer> frequencyMap = new HashMap<>();

            // Count frequency of characters in the first string
            for (char c : str1.toCharArray()) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }

            // Decrease the frequency of characters in the second string
            for (char c : str2.toCharArray()) {
                if (!frequencyMap.containsKey(c)) {
                    return false; // If a character in str2 is not present in str1, return false
                }
                frequencyMap.put(c, frequencyMap.get(c) - 1);
            }

            // Check if all frequencies are 0 (indicating same characters in both strings)
            for (int count : frequencyMap.values()) {
                if (count != 0) {
                    return false; // If any frequency is not 0, return false
                }
            }

            return true;
        }
    }






