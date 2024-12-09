package methods;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        double firstFactorial = calculateFactorial(firstNumber);
        double secondFactorial = calculateFactorial(secondNumber);

        double result = divideFactorials(firstFactorial, secondFactorial);
        System.out.printf("%.2f", result);
    }

    public static double calculateFactorial(int number) {
        double factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;

        }
        return factorial;
    }

    public static double divideFactorials(double firstFactorial, double secondFactorial) {

        return firstFactorial / secondFactorial;
    }
}
