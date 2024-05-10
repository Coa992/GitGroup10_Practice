package JahanaM.week5;

public class FindTheUnique {
    public static void main(String[] args) {
        String str = "ADFHHHHBGFF";
        String uniq="";

        for(int i =0; i<str.length();i++){
            char ch= str.charAt(i);
           if (str.indexOf(ch)==str.lastIndexOf(ch)){
               uniq +=ch;
           }
        }
        System.out.println(uniq);
    }
}
