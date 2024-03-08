package Zulfiya.week04;

public class reversed {
    public static void main(String[] args) {
        System.out.println(reversed_method("dcba"));
    }
    public static String reversed_method(String str){
        String newStr = "";
        for (int i = str.length()-1; i >-1 ; i--) {
            newStr+=str.charAt(i);
        }
        return newStr;
    }


    //*Write a function that can reverse a String*
    //* Ex: Reverse("ABCD"); ==> DCBA *
}
