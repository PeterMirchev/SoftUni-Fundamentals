package arrays;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // прочитам първи масив
        String[] first = scanner.nextLine().split(" ");
        // прочитам втори масив
        String[] second = scanner.nextLine().split(" ");

        // обхождам втория масив
        for (int position = 0; position < second.length; position++) {
            // запазвам всеки един стринг в проленлива
            String currentText = second[position];
            // обхождам първия масив
            for (int index = 0; index < first.length; index++) {

                //проверявам дали currentText е равна на една от стойностите в първия масив
                if (currentText.equals(first[index])) {
                    System.out.print(currentText + " ");
                }
            }
        }
    }
}
