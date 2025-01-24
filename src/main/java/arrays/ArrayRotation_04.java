package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine() //"1, 2, 3, 4"
                        .split(" ")) //{"1", "2", "3", "4"}
                        .mapToInt(Integer::parseInt)// {1, 2, 3, 4}
                        .toArray();

        int n = Integer.parseInt(scanner.nextLine());

        //създавам фор цикъл за всяко едно завъртане на масива
        for (int iteration = 1; iteration <= n; iteration++) {

            //запазвам първото число от масива
            int firstNum = array[0];

            //създавам вложен фор цикъл, за да извърша реместването на числата наляво
            for (int position = 0; position < array.length - 1; position++) {
                array[position] = array[position + 1];

            }
            //запазвам първото число на последно място
            array[array.length - 1] = firstNum;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
