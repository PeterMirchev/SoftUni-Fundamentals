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
        for (int row = 1; row <= n; row++) {

            //int[] array = Arrays
            //                .stream(scanner.nextLine().split(" ")) //"1 2 3 5".splt-> {"1","2","3","5"}
            //                .mapToInt(Integer:: parseInt)// {1, 2, 3, 5}
            //                .toArray();
            //прочитам сегашен ред
            String input = scanner.nextLine();
            //сплитвам текста по празно място, получавам масив от стринг и след това достъпвам елементите на масива по техния индекс
            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);

            //правя проверка дали реда е четен или нечетен
            if (row % 2 != 0) {
                firstArray[row - 1] = firstNumber;
                secondArray[row - 1] = secondNumber;
            } else {
                firstArray[row - 1] =secondNumber;
                secondArray[row - 1] = firstNumber;
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
