package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" ")) //"1 2 3 5".splt-> {"1","2","3","5"}
                .mapToInt(Integer:: parseInt)// {1, 2, 3, 5}
                .toArray();

        String input = scanner.nextLine();
        while (!input.split(" ")[0].equals("end")) {

            //взимам командата която ще трябва да извърша
            String command = input.split(" ")[0];

            if (command.equals("swap")) {
                // взимам първия елемент
                int firstIndex = Integer.parseInt(input.split(" ")[1]);
                // взимам втория елемент
                int secondIndex = Integer.parseInt(input.split(" ")[2]);

                int firstElement = array[firstIndex];
                int secondElement = array[secondIndex];
                //разменям елементите
                array[firstIndex] = secondElement;
                array[secondIndex] = firstElement;
            } else if (command.equals("multiply")) {
                // взимам първия елемент
                int firstIndex = Integer.parseInt(input.split(" ")[1]);
                // взимам втория елемент
                int secondIndex = Integer.parseInt(input.split(" ")[2]);
                int multiply = array[firstIndex] * array[secondIndex];

                array[firstIndex] = multiply;
            } else if (command.equals("decrease")) {
                for (int i = 0; i <= array.length - 1; i++) {
                    array[i] = array[i] - 1;
                }
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
