package Lisa.week05.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FindTheUniqu {
    public static void main(String[] args) {
/*
  String - Find the unique
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
       // System.out.println(findUniqe("AAABBBCCCDEF"));
        System.out.println(findUnique2("AAABBBCCCDEF"));
    }

    public static String findUniqe(String string) {
        String result = "";
        int count=0;
        for (int i = 0; i <string.length() ; i++) {
            count=0;
            char each1 = string.charAt(i);
            for (int j = 0; j <string.length() ; j++) {
               char each2=string.charAt(j);
               if(each1==each2){
                   count++;
               }
            }
            if(count==1){
                result+=each1;
            }
        }
        return result;

    }
    public static int findUnique2(String string){
        int frequency = 0;
        ArrayList<Character>arrayList=new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            Character each=string.charAt(i);

          arrayList.add(each);
            frequency=Collections.frequency(arrayList,each);
        }
return frequency;
    }

}
