package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound = false;

        for (int position = 0; position < array.length; position++) {

            if (array.length == 1) {
                System.out.println(0);
                break;
            }

            int leftSum = 0;
            int rightSum = 0;

            for (int left = 0; left < position; left++) {
                leftSum += array[left];
            }
            for (int right = position + 1; right <= array.length - 1; right++) {
                rightSum += array[right];
            }

            if (leftSum == rightSum) {
                System.out.println(position);
                isFound = true;
                break;
            }
        }

        if (!isFound && array.length > 1) {
            System.out.println("no");
        }
    }
}
