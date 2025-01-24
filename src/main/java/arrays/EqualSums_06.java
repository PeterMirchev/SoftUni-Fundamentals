package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))// "1 2 3 3" split -> {"1","2","3","3"}
                .mapToInt(Integer::parseInt) // {1, 2, 3, 3}
                .toArray();

        boolean isFound = false;

        // обхождам масива зада проверя всяко едно число
        for (int position = 0; position < array.length; position++) {

            // ако масива има само едно число то го принтирам
            if (array.length == 1) {
                System.out.println(0);
                break;
            }

            int leftSum = 0;
            int rightSum = 0;

            // взимам всички леви числа
            for (int left = 0; left < position; left++) {
                leftSum += array[left];
            }
            // взимам всички десни числа
            for (int right = position + 1; right <= array.length - 1; right++) {
                rightSum += array[right];
            }

            if (leftSum == rightSum) {
                System.out.println(position);
                isFound = true;
                break;
            }
        }

        // ако не сме намерили равни суми и масива има повече от един елемент принтирам "no"
        if (!isFound && array.length > 1) {
            System.out.println("no");
        }
    }
}
