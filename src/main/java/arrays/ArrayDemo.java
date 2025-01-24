package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Масив от цели числа
        int[] number = new int[3];//оказвам дъжината на масива
        number[0] = 5;
        number[1] = 5;
        number[2] = 5;
        System.out.println();//дебъг, показвам масива как има [5,5,5]

        //Прочитане на масив от конзолата
        //"Varna Pleven Sofia"
        String[] towns = scanner.nextLine().split(" ");//използвам метода split който ми връша масив от стринг.

        //foraech цикъл - използваме когато просто искаме да обходим една колекция, един масив и не ни трябват позиите или индексите
        for (String town : towns) {
            System.out.println(town);
        }

        // потоци от данни - това ще се обсъди по-напред
        //прочитане на целочислен масив от конзолата; поточна линия
        //метод референс - ламбда референс
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
