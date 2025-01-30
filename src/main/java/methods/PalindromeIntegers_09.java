package methods;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            System.out.println(validatePalindrome(input));
            input = scanner.nextLine();
        }
    }

    public static boolean validatePalindrome(String input) {

        String reversed = "";

        // обхождам стринга отазд напред
        for (int i = input.length() - 1; i >= 0 ; i--) {

            reversed += input.charAt(i);
        }

       return reversed.equals(input);
    }
}
