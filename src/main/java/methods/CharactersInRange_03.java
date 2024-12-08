package methods;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        printCharactersInRange(firstChar, secondChar);
    }

    public static void printCharactersInRange(char firstChar, char secondChar) {

        for (int i = Math.min(firstChar, secondChar) + 1; i < Math.max(secondChar,firstChar) ; i++) {
            System.out.printf("%c ", i);
        }

       /* for (char i = (char) (firstChar/secondChar); i < firstChar/secondChar ; i++) {
            System.out.printf("%c ", i);
        }*/
    }
}
