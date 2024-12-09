package methods;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacter(input);
    }

    public static void printMiddleCharacter(String input) {

        int length = input.length();
        int index = input.length() / 2;

        if (length % 2 == 0) {
            char first = input.charAt(index);
            char second = input.charAt(index - 1);
            System.out.println("" + second + first);
        } else {
            char symbol = input.charAt(index);
            System.out.println("" + symbol);
        }
    }
}
