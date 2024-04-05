package Lisa.week06.task1;

public class String_PasswordValidation {

    public static void main(String[] args) {
        /*
        Write a return method that can verify if a password is valid or not.
-Requirements:
Password MUST be at least have 6 characters and should not contain space
PassWord should at least contain one upper-case letter
PassWord should at least contain one lowercase letter
Password should at least contain one special character
Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false
         */
        System.out.println(passwordValidation("Ghbdtn1!"));
    }

    public static String passwordValidation(String password) {
        char digit = 0;
        char lowerCaseLetter = 0;
        char upperCaseLetter = 0;
        char specialCharacter = 0;
        char whitespace = 0;
        for (int i = 0; i < password.length(); i++) {
            Character each = password.charAt(i);
            if (Character.isLowerCase(each)) {
                lowerCaseLetter = each;
            }
            if (Character.isUpperCase(each)) {
                upperCaseLetter = each;
            }
            if (Character.isDigit(each)) {
                digit = each;
            }
            if (Character.isSpaceChar(each)) {
                whitespace = each;
            }
            if (!(Character.isLetterOrDigit(each))) {
                specialCharacter = each;
            }
        }
        if (password.length() >= 6 && password.contains(lowerCaseLetter + "") && password.contains(upperCaseLetter + "")
                && password.contains(digit + "") && password.contains(specialCharacter + "") &&
                (!(password.contains(whitespace + "")))) {
            return "Password is valid";
        }
        return "Invalid password";
    }
}
