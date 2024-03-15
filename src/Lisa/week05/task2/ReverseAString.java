package Lisa.week05.task2;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAString {
    public static void main(String[] args) {
        /*
          String -- Reverse
Write a function that can reverse a String
Ex: Reverse("ABCD"); ==> DCBA *
         */
        System.out.println(reverse2("ABCD"));
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char each = str.charAt(i);
            result += each;
        }

        return result;
    }
    public static String reverse2(String str){

        ArrayList<Character>list=new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            list.add(each);
        }
        Collections.reverse(list);
        return list.toString();
    }
}
