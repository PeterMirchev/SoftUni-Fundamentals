package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {

            String symbol = String.valueOf(input.charAt(i));
            if (symbol.equals(" ")) {
                continue;
            }
            if (!chars.containsKey(symbol)) {
                chars.put(symbol, 1);
            } else {
                int currentCount = chars.get(symbol);
                chars.put(symbol, currentCount + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
