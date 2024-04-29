package JahanaM.week11;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFreqOfChar {
    public static void main(String[] args) {

        frequencyOfCharacters("aaabbbbbsssitttgg");
    }

    public static void frequencyOfCharacters(String string) {
        Map<Character, Integer> frequencyOfCharacters = new LinkedHashMap<>();
        int count = 0;


        for (int i = 0; i < string.length(); i++) {
            count=0;
            char each1 =string.charAt(i);
            for (int j = 0; j < string.length(); j++) {
                char each2 =string.charAt(j);
                if(each1==each2){
                    count++;

                }
            }
            frequencyOfCharacters.put(each1,count);
        }
        System.out.println(frequencyOfCharacters);

    }
}
