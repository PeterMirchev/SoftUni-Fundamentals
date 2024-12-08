package methods;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean validLength = validateLength(password);
        boolean containsCharactersAndLetters = validateCharacters(password);
        boolean containsAtLeast2Digits = validateDigits(password);

        if (!validLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!containsCharactersAndLetters) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!containsAtLeast2Digits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (validLength && containsAtLeast2Digits && containsCharactersAndLetters) {
            System.out.println("Password is valid");
        }
    }

    public static boolean validateLength(String password) {

        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }

        return false;
    }

    public static boolean validateCharacters(String password) {

        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }

        return count >= 2;
    }


}
