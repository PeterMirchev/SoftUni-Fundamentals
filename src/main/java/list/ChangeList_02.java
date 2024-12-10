package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String command = input.split(" ")[0];

            switch (command) {
                case "Delete":
                    int element = Integer.parseInt(input.split(" ")[1]);
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == element) {
                            numbers.remove(i);
                        }
                    }
                    break;
                case "Insert":
                    int elementInsert = Integer.parseInt(input.split(" ")[1]);
                    int position = Integer.parseInt(input.split(" ")[2]);
                    numbers.add(position, elementInsert);
                    break;
            }

            input = scanner.nextLine();
        }

        numbers.forEach(e -> System.out.print(e + " "));
    }
}
