package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Double> productsPrice = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productsQuantity = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            // Beer 2.20 100
            String productName = input.split("\\s+")[0]; //split()[0] -> "Beer"
            double price = Double.parseDouble(input.split("\\s+")[1]); //split()[1] -> 2.20
            int quantity = Integer.parseInt(input.split("\\s+")[2]); //split()[1] -> 100

            //проверявам дали имам такъв продукт
            if (productsQuantity.containsKey(productName)) {
                int currentQuantity = productsQuantity.get(productName);
                productsQuantity.put(productName, currentQuantity + quantity);
            } else {
                productsQuantity.put(productName, quantity);
            }
            //ако цената е различна от сегашната, ще я променя.
            productsPrice.put(productName, price);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : productsQuantity.entrySet()) {

            String productName = entry.getKey();
            int productQuantity = entry.getValue();
            double productPrice = productsPrice.get(productName);

            System.out.printf("%s -> %.2f%n", productName, productPrice * productQuantity);
        }
    }
}
