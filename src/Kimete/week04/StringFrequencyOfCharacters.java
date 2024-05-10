package Kimete.week04;

import java.util.HashMap;
import java.util.Map;

public class StringFrequencyOfCharacters {

        public static void main(String[] args) {
            String str = "AAABBCDD";
            String frequency = frequencyOfChars(str);
            System.out.println("Original string: " + str);
            System.out.println("Frequency of characters: " + frequency);
        }

        public static String frequencyOfChars(String str) {
            Map<Character, Integer> frequencyMap = new HashMap<>();

            // Count frequency of characters in the string
            for (char c : str.toCharArray()) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }

            // Construct the result string
            StringBuilder result = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                result.append(entry.getKey()).append(entry.getValue());
            }

            return result.toString();
        }
    }




