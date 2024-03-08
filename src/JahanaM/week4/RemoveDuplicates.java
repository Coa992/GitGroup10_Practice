package JahanaM.week4;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains(""+each)){
                result +=each;//
            }
        }

        System.out.println(result);
    }



}
