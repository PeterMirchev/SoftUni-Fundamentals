package methods;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printVowelsCount(input);
    }

    public static void printVowelsCount(String input) {
        int count = 0;

        for (int i = 0; i < input.length() ; i++) {

            String toLowerCase = input.toLowerCase();

            switch (toLowerCase.charAt(i)) {
                case 'a':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
}
