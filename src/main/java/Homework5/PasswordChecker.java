/**@author Lizi Gavardashvili*/
package Homework5;

public class PasswordChecker {
    public static boolean isStrong(String password){
        boolean hasDigit = false;
        boolean hasUppercase = false;
        boolean islongPassword = false;

        if (password.length() >=8 ) {
            islongPassword = true;
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                hasUppercase = true;
            }
        }
        if (islongPassword && hasUppercase && hasDigit) {
            return true;

        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        String myPassword = "lizi1234";
        System.out.println(isStrong(myPassword));
    }
}
