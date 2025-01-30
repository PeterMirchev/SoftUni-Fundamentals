package methods;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // прочитам текст и го правя в малки букви
        String text = scanner.nextLine().toLowerCase();

        int countVowels = getVowelsCount(text);

        System.out.println(countVowels);
    }

    // създавам си метод който връща цяло число и приема стринг параметъ
    public static int getVowelsCount(String text) {

        int count = 0;

        // правя текта на масив от чарове и проверявам всеки един от тях дали е гласна буква
        for(char letter : text.toCharArray()) {

            if (letter == 'a' || letter == 'o' || letter == 'e' || letter == 'i' || letter == 'u') {
                count++;
            }
        }

        //връщам резултата
        return count;
    }
}
