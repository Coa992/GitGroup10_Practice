package Zulfiya.week3;

public class frequency {
    public static void main(String[] args) {
        String str ="AAABBCDD";
        String a = "";

        String word = "";

        int count = 0;
        for(int i = 0; i<str.length()-1; i++){

            for (int j = 0; j <str.length()-1; j++) {
               if (str.charAt(i)==str.charAt(j)){
                  count++;
               }
            }

        }

        System.out.println(+count);

        //1️⃣  String - Frequency of Characters`
        //Write a return method that can find the frequency of characters
        //  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
    }
}
