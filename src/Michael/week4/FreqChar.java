package Michael.week4;

public class FreqChar {
    public static void main(String[] args) {

        String str =  "bbbcccrrjyby";
        String result ="";



        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch + "" + count;


        }
        System.out.println(result);

    }


}
