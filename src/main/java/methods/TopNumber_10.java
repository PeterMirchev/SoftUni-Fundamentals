package methods;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            boolean isDivisibleBy8 = validateDivisibleBy8(i);
            boolean containsOddDigit = validateOddDigit(i);

            if (isDivisibleBy8 && containsOddDigit) {
                System.out.println(i);
            }
        }
    }

    public static boolean validateDivisibleBy8(int number) {

        int sum = 0;
        while (number > 0) {

            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }

        return  sum % 8 == 0;
    }

    private static boolean validateOddDigit(int number) {

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
