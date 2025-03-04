package TextProcessing;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String username : input) {

            //валидирам username по критериите спрямо условието в метод
            boolean validUsername = validateUsername(username);

            if (validUsername) {
                System.out.println(username);
            }
        }
    }

    private static boolean validateUsername(String username) {

        //Has a length of between 3 and 16 characters.
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        //It contains only letters, numbers, hyphens, and underscores
        //username.toCharArray() -> дава ми масив от чарове и така обхождам стринга с foreach
        for (char symbol : username.toCharArray()) {

            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }

        return true;
    }
}
