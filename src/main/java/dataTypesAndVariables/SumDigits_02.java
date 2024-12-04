package dataTypesAndVariables;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int result = 0;
        for (int i = 0; i < input.length() ; i++) {

            int currentNum = Integer.parseInt(input.charAt(i) + "");

            result += currentNum;
        }

        System.out.println(result);
    }
}
