package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            int[] num = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (i % 2 == 0) {
                firstArray[i] = num[0];
                secondArray[i] = num[1];
            } else {
                firstArray[i] = num[1];
                secondArray[i] = num[0];
            }
        }

        for (int i : firstArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : secondArray) {
            System.out.print(i + " ");
        }
    }
}
