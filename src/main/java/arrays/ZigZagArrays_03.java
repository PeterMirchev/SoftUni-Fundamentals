package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитам дължината на масива
        int n = Integer.parseInt(scanner.nextLine());

        // създавам 2 празни масива с прочетената дължина
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        //прочитам n на брой редове
        for (int i = 0; i < n; i++) {

            //прочитам сегашен ред
            String input = scanner.nextLine();
            //сплитвам текста по празно място, получавам масив от стринг и след това достъпвам елементите на масива по техния индекс
            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);

            //правя проверка дали реда е четен или нечетен
            if (i % 2 == 0) {
                firstArray[i] = firstNumber;
                secondArray[i] = secondNumber;
            } else {
                firstArray[i] =secondNumber;
                secondArray[i] = firstNumber;
            }
        }

        for (int number : firstArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
    }
}
