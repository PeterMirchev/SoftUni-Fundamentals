package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> reservationList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();

            String name = input.split(" ")[0];
            if (input.split(" ").length == 3) {
                if (reservationList.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    reservationList.add(name);
                }
            } else if (input.split(" ").length == 4) {
                if (!reservationList.contains(name)) {
                    System.out.println(name + " is not in the list!");
                } else {
                    reservationList.remove(name);
                }
            }
        }

        for (String name : reservationList) {
            System.out.println(name);
        }
    }
}
