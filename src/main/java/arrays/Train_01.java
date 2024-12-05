package arrays;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[] array = new int[size];

        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
            sum += array[i];
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
