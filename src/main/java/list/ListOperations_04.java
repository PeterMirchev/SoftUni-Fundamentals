package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {

            String command = input.split("\\s+")[0];
            String direction = input.split("\\s+")[1];

            if (command.equals("Add")) {
                int number = Integer.parseInt(input.split("\\s+")[1]);
                numbers.add(number);
            } else if (command.equals("Insert")) {
                int number = Integer.parseInt(input.split("\\s+")[1]);
                int index = Integer.parseInt(input.split("\\s+")[2]);
                if (index >= numbers.size() || index < 0) {
                    System.out.println("Invalid index");
                } else {
                    numbers.add(index, number);
                }
            } else if (command.equals("Remove")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                if (index >= numbers.size() || index < 0) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(index);
                }
            } else if (direction.equals("left")) {
                int count = Integer.parseInt(input.split("\\s+")[2]);
                for (int i = 1; i <= count; i++) {
                    int number = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(numbers.size(), number);
                }
            } else if (direction.equals("right")) {
                int count = Integer.parseInt(input.split("\\s+")[2]);
                for (int i = 1; i <= count; i++) {
                    int number = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, number);
                }
            }

            input = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
