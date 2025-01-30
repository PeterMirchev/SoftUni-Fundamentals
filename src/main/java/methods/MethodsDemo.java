package methods;

import java.util.Scanner;

public class MethodsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = getName();

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int minNumber = getMinNumber(num1, num2);

    }

    public static String getName() {

        return "Desi";
    }

    public static int getMinNumber(int num1, int num2) {

        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
