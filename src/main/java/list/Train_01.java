package list;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            if (input.split(" ")[0].equals("Add")) {
                int wagonToAdd = Integer.parseInt(input.split(" ")[1]);
                wagons.add(wagonToAdd);
            } else {
                int passengers = Integer.parseInt(input.split(" ")[0]);
                for (int i = 0; i <= wagons.size() - 1; i++) {
                    if (wagons.get(i) + passengers <= maxCapacity) {
                        wagons.set(i, wagons.get(i) + passengers);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
