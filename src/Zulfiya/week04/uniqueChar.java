package Zulfiya.week04;

public class uniqueChar {
    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));

    }

    public static String unique(String str) {
        String newStr = "";
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            if (str.indexOf(eachLetter) == str.lastIndexOf(eachLetter)) {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
    //🥇 **JAVA CODING TASKS - WEEK 05** 🥇 <@&1139215120678006850>
    //
    //1️⃣  **String - Find the unique **
    //*Write a return method that can find the unique characters from the String
    // Ex: unique("AAABBBCCCDEF") ==> "DEF";*
    //

}
