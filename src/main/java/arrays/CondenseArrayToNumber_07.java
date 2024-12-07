package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean alreadyCondense = false;

        if (array.length == 1) {
            System.out.println(array[0]);
            return;
        }

        while (array.length > 1) {
            int[] condense = new int[array.length - 1];

            for (int i = 0; i < array.length - 1; i++) {
                condense[i] = array[i] + array[i + 1];
            }
            array = condense;
        }

        System.out.println(array[0]);
    }
}
