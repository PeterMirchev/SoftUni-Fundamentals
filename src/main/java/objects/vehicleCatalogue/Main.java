package objects.vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {

            String type = input.split("\\s+")[0];
            String model = input.split("\\s+")[1];
            String color = input.split("\\s+")[2];
            int horsepower = Integer.parseInt(input.split("\\s+")[3]);

            if (type.equals("car")) {
                type = "Car";
            } else {
                type = "Truck";
            }
            Vehicle vehicle = new Vehicle(type, model, color, horsepower);

            vehicles.add(vehicle);

            input = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while (!model.equals("Close the Catalogue")) {

         /*   for (Vehicle v : vehicles) {
                if (v.getModel().equals(model)) {
                    System.out.println(v.toString());
                }
            }*/
            String currentModel = model;
            vehicles.stream()
                    .filter(v -> v.getModel().equals(currentModel))
                    .forEach(System.out::println);

            model = scanner.nextLine();
        }

        double carsAvgHorsePower = getAvgHorsePower(vehicles, "Car");

        double trucksAvgHorsePower = getAvgHorsePower(vehicles, "Truck");

        System.out.printf("Cars have average horsepower of: %.2f.%n", carsAvgHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f.", trucksAvgHorsePower);
    }

    private static double getAvgHorsePower(List<Vehicle> vehicles, String type) {

        int sum = vehicles
                .stream()
                .filter(v -> v.getType().equals(type))
                .mapToInt(Vehicle::getHorsepower)
                .sum();

        double count = vehicles.stream()
                .filter(v -> v.getType().equals(type))
                .count();

        if (count == 0 || sum == 0) {
            return 0;
        }

        return sum / count;
    }
}
