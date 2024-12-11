package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> bombAndPower = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int bomb = bombAndPower.get(0);
        int power = bombAndPower.get(1);

        while (numbers.contains(bomb)) {

            int bombIndex = numbers.indexOf(bomb);

            int start = bombIndex - power;
            if (start < 0) {
                start = 0;
            }

            int end = bombIndex + power;
            if (end > numbers.size() - 1) {
                end = numbers.size() - 1;
            }

            for (int i = end; i >= start; i--) {
                numbers.remove(i);
            }
        }

        int sum = 0;
        /*for (Integer n : numbers) {
            sum += n;
        }*/
        sum = numbers
                .stream()
                .mapToInt(num -> Integer.parseInt(num.toString()))
                .sum();
        System.out.println(sum);
    }
}
