package dataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int spice = 0;
        while (yield >= 100) {

            spice += yield;
            spice -= 26;
            yield -= 10;
            days++;
        }
        if (spice < 26) {
            spice = 0;
        } else {
            spice -= 26;
        }

        System.out.println(days);
        System.out.println(spice);
    }
}
