package Kimete.week06;

public class PasswordValidation {


        public static void main(String[] args) {
            String password = "Example@123";
            System.out.println(validatePassword(password));
        }

        public static boolean validatePassword(String password) {
            if (password == null || password.length() < 6 || password.contains(" ")) {
                return false;
            }

            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasSpecialChar = false;
            boolean hasDigit = false;

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if (isSpecialCharacter(c)) {
                    hasSpecialChar = true;
                }
            }

            return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
        }

        private static boolean isSpecialCharacter(char c) {
            String specialCharacters = "!@#$%^&*()-+";
            return specialCharacters.contains(String.valueOf(c));
        }
    }


