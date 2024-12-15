package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Double> productPrice = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productQuantity = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {

            String productName = input.split("\\s+")[0];
            double price = Double.parseDouble(input.split("\\s+")[1]);
            int quantity = Integer.parseInt(input.split("\\s+")[2]);

            if (productPrice.containsKey(productName)) {
                double currentPrice = productPrice.get(productName);
                int currentQuantity = productQuantity.get(productName);
                productPrice.put(productName, price);
                productQuantity.put(productName, currentQuantity + quantity);
            } else {
                productPrice.put(productName, price);
                productQuantity.put(productName, quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productPrice.entrySet()) {

            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue() * productQuantity.get(entry.getKey()));
        }
    }
}
