package methods;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        // 1 - проверяваме дали дължината на паролата е между 6 и 10 символа
        boolean isLengthValid = validateLength(password);
        // 2 - проверяваме дали паролата се състои само от цифри и букви
        boolean containsCharactersAndLetters = validateCharacters(password);
        // 3 - проверяваме дали паролата има поне 2 цифри
        boolean containsAtLeast2Digits = validateDigits(password);

        if (!isLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!containsCharactersAndLetters) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!containsAtLeast2Digits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isLengthValid && containsAtLeast2Digits && containsCharactersAndLetters) {
            System.out.println("Password is valid");
        }
    }

    public static boolean validateLength(String password) {

        // return password.length() >= 6 && password.length() <= 10
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }

    public static boolean validateCharacters(String password) {

        // превръщам един стринг в масив от символи -
        for (char symbol : password.toCharArray()) {
            // извиквам класа Character и метода който проверява дали един символ е буква или цифра
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
