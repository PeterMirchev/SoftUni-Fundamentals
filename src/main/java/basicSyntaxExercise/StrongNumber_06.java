package basicSyntaxExercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int number = Integer.parseInt(input);
        int totalSum = 0;
        for (int i = 0; i < input.length(); i++) {

            int currentNum = Integer.parseInt(input.charAt(i) + "");

            int currentSum = 1;
            for (int j = 1; j <= currentNum; j++) {

                currentSum = currentSum * j;
            }

            totalSum += currentSum;
        }

        if (totalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
