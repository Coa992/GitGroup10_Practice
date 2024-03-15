package Lisa.week04.task1;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println("frequencyOfCharacters(\"AAABBCDDAA\") = " + frequencyOfCharacters(
                "AABBDDAAZZDD"));
    }

    public static String frequencyOfCharacters(String str) {
        String result = "";
        int frequency = 0;


        for (int i = 0; i < str.length() - 1; i++) {
            frequency = 0;
            char each1 = str.charAt(i);
            if (!(result.contains(each1 + ""))) {
                for (int j = 0; j < str.length(); j++) {
                    char each2 = str.charAt(j);
                    if (!(result.contains(each1 + ""))) {
                        result += each1;
                    }
                    if (each1 == each2) {
                        frequency++;
                    }
                }
                result += frequency;
            }
        }
        return result;


    }


}
