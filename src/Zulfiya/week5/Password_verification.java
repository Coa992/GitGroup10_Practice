package Zulfiya.week5;

public class Password_verification {
    public static void main(String[] args) {
        System.out.println(password_validation("String65"));
    }
    public static boolean password_validation(String password){
        Boolean first = (password.length()>=6 && !password.contains(" ") );
        Boolean second = false;
        Boolean third = false;
        Boolean fourth = false;
        Boolean fifth = false;
        Boolean sixth = false;
        Boolean seventh = false;


        for (char eachchar : password.toCharArray()) {
            if (Character.isDigit(eachchar)){
                second = true;
                  break;
            }
        }
        for (char eachchar : password.toCharArray()) {
            if (Character.isUpperCase(eachchar)) {
             third = true;
                break;
            }
        }
        for (char eachchar : password.toCharArray()) {
            if (Character.isLowerCase(eachchar)) {
             fourth = true;
                break;
            }
        }
        for (char eachchar : password.toCharArray()) {
            if (Character.isDigit(eachchar)) {
            seventh = true;
                break;
            }
        }
        for (char eachchar : password.toCharArray()) {
            if (Character.isUpperCase(eachchar)) {
           fifth = true;
                break;
            }
        }
        for (char eachchar : password.toCharArray()) {
            if (!Character.isLetterOrDigit(eachchar)) {
             sixth = true;
                break;
            }
        }
        return first && second && third && fourth &&fifth && sixth && seventh;

    }
        //1️⃣ ** String_PasswordValidation**
        //*Write a return method that can verify if a password is valid or not.
        //-Requirements:
        //#Password MUST be at least have 6 characters and should not contain space
        //#PassWord should at least contain one upper-case letter
        //#PassWord should at least contain one lowercase letter
        //Password should at least contain one special character
        //Password should at least contain a digit
        //-if all requirements above are met, the method returns true, otherwise returns  false*
        //



}
