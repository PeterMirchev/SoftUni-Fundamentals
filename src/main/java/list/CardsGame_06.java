package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOneCards = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> playerTwoCards = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!playerOneCards.isEmpty() && !playerTwoCards.isEmpty()) {

            int playerOne = playerOneCards.get(0);
            int playerTwo = playerTwoCards.get(0);

            playerOneCards.remove(0);
            playerTwoCards.remove(0);

            if (playerOne == playerTwo) {
                playerOneCards.remove(0);
                playerTwoCards.remove(0);
            } else if (playerOne > playerTwo) {
                playerOneCards.add(playerOne);
                playerOneCards.add(playerTwo);
            } else if (playerTwo > playerOne) {
                playerTwoCards.add(playerTwo);
                playerTwoCards.add(playerOne);
            }
        }

        int result = 0;

        if (playerTwoCards.isEmpty()) {
            result = playerOneCards
                    .stream()
                            .mapToInt(Integer::intValue)
                                    .sum();
            System.out.printf("First player wins! Sum: %d", result);
        } else {
            result = playerTwoCards
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.printf("Second player wins! Sum: %d", result);
        }
    }
}
