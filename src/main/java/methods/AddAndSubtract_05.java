package methods;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sumNumber = sum(firstNumber, secondNumber);
        int result = subtract(sumNumber, thirdNumber);

        System.out.println(result);
    }

    public static int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public static int subtract(int sumNumber, int thirdNumber) {

        return  sumNumber - thirdNumber;
    }

}
