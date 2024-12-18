package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        String obtainedItem = "";
        boolean isObtained = false;
        while (!isObtained) {
            String input = scanner.nextLine().toLowerCase();
            String[] data = input.split("\\s+");

            for (int i = 0; i < data.length; i += 2) {
                int quantity = Integer.parseInt(data[i]);
                String material = data[i + 1];

                if (!materials.containsKey(material)) {
                    materials.put(material, quantity);
                } else {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + quantity);
                }

                int totalQuantity = materials.get(material);
                if (totalQuantity >= 250) {
                    if (material.equals("shards")) {
                        obtainedItem = "Shadowmourne";
                        isObtained = true;
                    } else if (material.equals("fragments")) {
                        obtainedItem = "Valanyr";
                        isObtained = true;
                    } else if (material.equals("motes")) {
                        obtainedItem = "Dragonwrath";
                        isObtained = true;
                    }
                }
                if (isObtained) {
                    materials.put(material, materials.get(material) - 250);
                    break;
                }
            }
            if (isObtained) {
                break;
            }

        }

        System.out.println(obtainedItem + " obtained!");
       /* for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
        */
        materials.forEach( (k, v) -> System.out.printf("%s: %d%n", k, v));

    }
}
