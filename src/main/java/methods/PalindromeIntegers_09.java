package methods;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            validatePalindrome(input);

            input = scanner.nextLine();
        }
    }

    public static void validatePalindrome(String number) {

        String reversed = "";

        for (int i = number.length() - 1; i >= 0 ; i--) {

            reversed += number.charAt(i);
        }

        System.out.println(reversed.equals(number));
    }
}
