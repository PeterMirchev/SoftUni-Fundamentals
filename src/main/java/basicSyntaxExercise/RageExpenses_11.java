package basicSyntaxExercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetTrashTimes = lostGames / 2;
        int mouseTrashTimes = lostGames / 3;
        int keyboardTrashTimes = lostGames / 6;
        int displayTrashTimes = lostGames / 12;

        double totalPrice = (headsetPrice * headsetTrashTimes) +
                (mousePrice * mouseTrashTimes) +
                (keyboardPrice * keyboardTrashTimes) +
                (displayPrice * displayTrashTimes);

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
