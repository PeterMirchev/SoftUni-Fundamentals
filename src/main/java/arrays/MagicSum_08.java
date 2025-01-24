package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicNumber = Integer.parseInt(scanner.nextLine());

        // обхождам прочетения масив
        for (int position = 0; position <= array.length - 1; position++) {
            //запазвам сегашното число от масива
            int currentNumber = array[position];

            // обхождам масива след сегащното число
            for (int nextPosition = position + 1; nextPosition <= array.length - 1; nextPosition++) {

                //намирам комбинацията
                int combination = currentNumber + array[nextPosition];
                //проверавам дали комбинацията е равна на магическото число
                if (combination == magicNumber) {
                    System.out.println(currentNumber + " " + array[nextPosition]);
                }
            }

        }
    }
}
