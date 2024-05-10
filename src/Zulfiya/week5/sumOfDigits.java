package Zulfiya.week5;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum_method("12 java 5 apple 3"));
    }
    public static  int sum_method (String string){
        String digits ="";
        for (char eachChar: string.toCharArray()){
            if(Character.isDigit(eachChar)){
                digits+=eachChar;
            }
        }
        int sum = 0;
     //   int newDigits= Integer.parseInt(digits);
        for (int i = 0; i < digits.length(); i++) {
            sum+=Character.getNumericValue(digits.charAt(i));
        }

       return sum;
        }
    }

//3️⃣ **String_SumOfAllDigits**
//*Write a method that can return the sum of the digits in a String
//Ex:  "12 java 5 apple 3"  ==>  20*