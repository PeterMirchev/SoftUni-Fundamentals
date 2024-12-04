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
        int keyboardTrashTimes = 0;
        int displayTrashTimes = 0;

        for (int i = 6; i <=  lostGames; i += 6) {
            keyboardTrashTimes++;
        }

        for (int i = 12; i <= lostGames; i += 12) {
            displayTrashTimes++;
        }

        double totalPrice = (headsetPrice * headsetTrashTimes) + (mousePrice * mouseTrashTimes) + (keyboardPrice * keyboardTrashTimes) + (displayPrice * displayTrashTimes);

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
