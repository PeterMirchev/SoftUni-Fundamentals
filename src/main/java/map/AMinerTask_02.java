package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();
        while (!input.equals("stop")) {

            int quantity = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(input)) {
                int currentQuantity = resources.get(input);
                resources.put(input, currentQuantity + quantity);
            } else {
                resources.put(input, quantity);
            }

            input = scanner.nextLine();
        }

        //resources.forEach((key, value) -> System.out.println(key + " -> " + value));

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
