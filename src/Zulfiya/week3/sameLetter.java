package Zulfiya.week3;

public class sameLetter {
    public static  boolean same(String word1, String word2){
        boolean contains=true;
        for (int i = 0; i <word1.length()-1 ; i++) {
            for (int j = 0; j <word2.length()-1 ; j++) {
                if (word1.substring(i).contains(word2.substring(j))){
                    contains=true;
                }
                return contains;
            }
        }
       return contains;
    }

    public static void main(String[] args) {
        System.out.println( same("abc", "cab"));
        System.out.println( same("abc", "kuf"));
    }
    //2️⃣  String - Same letters
    //Write a return method that checks if a string is built out of the same letters as another string.
    //  Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false
}
