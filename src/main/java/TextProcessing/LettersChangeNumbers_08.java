package TextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] codes = scanner.nextLine().split("\\s+");

        double sum = 0;

        for (String code : codes) {

            double result = calculateCodeResult(code);

            sum += result;
        }

        System.out.printf("%.2f", sum);
    }

    private static double calculateCodeResult(String code) {
        //Б е на позиция 2. Пресмятам го, като от аски кода на Б (66) извадя 64 и получавам 2.
        //използвайки предния код преди главните букви (64) и от аски кода на главната буква извадим него,
        //ще получим позицията на тази главна буква в азбуката

        char letterBefore = code.charAt(0);
        double number = Double.parseDouble(code.substring(1, code.length() - 1));
        char letterAfter = code.charAt(code.length() - 1);

        //1. Letter Before Manipulation
        //If it's uppercase, you divide the number by the letter's position in the alphabet.
        //If it's lowercase, you multiply the number with the letter's position in the alphabet.
        if (Character.isUpperCase(letterBefore)) {
            number = number / (letterBefore - 64);
        } else {
            number = number * (letterBefore - 96);
        }

        //2. Letter After Manipulation
        //•	If it's uppercase, you subtract its position from the resulted number.
        //•	If it's lowercase, you add its position to the resulted number.
        if (Character.isUpperCase(letterAfter)) {
            number = number - (letterAfter - 64);
        } else {
            number = number + (letterAfter - 96);
        }

        return number;
    }
}
