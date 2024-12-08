package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean availableSpace = true;
        for (int i = 0; i <= lift.length - 1; i++) {
            int currentCabin = lift[i];
            while (currentCabin < 4 && people > 0) {
                currentCabin++;
                people--;
            }
            lift[i] = currentCabin;
            if (currentCabin == 4) {
                availableSpace = false;
            } else {
                availableSpace = true;
            }
        }

        if (availableSpace) {
            System.out.println("The lift has empty spots!");
            for (int i : lift) {
                System.out.print(i + " ");
            }
        } else if (people == 0) {
            for (int i : lift) {
                System.out.print(i + " ");
            }
        } else {
            System.out.printf("There isn't enough space! %s people in a queue!%n",people);
            for (int i : lift) {
                System.out.print(i + " ");
            }
        }


    }
}
