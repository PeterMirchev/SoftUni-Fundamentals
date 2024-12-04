package dataTypesAndVariables;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})
        double ballValue = Double.MIN_VALUE;
        int ballSnow = 0;
        int ballTIme = 0;
        int ballQuantity = 0;
        for (int i = 1; i <= n; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double calculatedSnowball = Math.pow(snowballSnow * 1.0 / snowballTime, snowballQuality);

            if (calculatedSnowball > ballValue) {
                ballValue = calculatedSnowball;
                ballSnow = snowballSnow;
                ballTIme = snowballTime;
                ballQuantity = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", ballSnow, ballTIme, ballValue, ballQuantity);
    }
}
