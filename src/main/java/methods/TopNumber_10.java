package methods;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {

            // 1 - проверявам дали числото се дели на 8
            boolean isDivisibleBy8 = validateDivisibleBy8(number);
            // 2 - проверявам дали числото има поне една нечетна цифра
            boolean containsOddDigit = validateOddDigit(number);

            // 3 - ако числото се седли на 8 и има поне една нечетна цифра го принтирам
            if (isDivisibleBy8 && containsOddDigit) {
                System.out.println(number);
            }
        }
    }

    public static boolean validateDivisibleBy8(int number) {

        int sum = 0;
        while (number > 0) {
            // 1 - взимам последната цифра
            int lastDigit = number % 10;
            // 2 - пробавям цифрата към сумата
            sum += lastDigit;
            // 3 - махам последната цифра
            number = number / 10;
        }

        return  sum % 8 == 0;
    }

    private static boolean validateOddDigit(int number) {

        while (number > 0) {
            // 1 - взимам последната цифра
            int lastDigit = number % 10;
            // 2 - правя проверка дали е нечетна цифра
            if (lastDigit % 2 != 0) {
                // ако е нечетна цифра връщам true
                return true;
            }
            // махам последната цифра
            number = number / 10;
        }

        // ако не съм намерил нечетна цифра, връщам false
        return false;
    }
}
