package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer:: parseInt)
                .toArray();

        String input = scanner.nextLine();
        while (!input.split(" ")[0].equals("end")) {
            String[] command = input.split(" ");
            String toDo = command[0];
            int firstIndex = 0;
            int secondIndex = 0;
            if (command.length == 3) {
                firstIndex = Integer.parseInt(command[1]);
                secondIndex = Integer.parseInt(command[2]);
            }

            switch (toDo) {
                case "swap":
                    int swapFirst = array[firstIndex];
                    int swapSecond = array[secondIndex];
                    array[firstIndex] = swapSecond;
                    array[secondIndex] = swapFirst;
                    break;
                case "multiply":
                    int multiply = array[firstIndex] * array[secondIndex];
                    array[firstIndex] = multiply;
                    break;
                case "decrease":
                    for (int i = 0; i <= array.length - 1; i++) {
                        array[i] = array[i] - 1;
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i <= array.length - 1; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }

    }
}
