package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();
        while (!resource.equals("stop")) {

            int quantity = Integer.parseInt(scanner.nextLine());

            //проверявам дали вече имам такър ресурс в мапа
            if (resources.containsKey(resource)) {
                //взимам сегашното количество
                int currentQuantity = resources.get(resource);
                //запазвам ресурса със сегашното количество + новото
                resources.put(resource, currentQuantity + quantity);
            } else {
                resources.put(resource, quantity);
            }

            resource = scanner.nextLine();
        }

        //resources.forEach((key, value) -> System.out.println(key + " -> " + value));

        //resources.entrySet().forEach(entry -> System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue()));

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
