package dataTypesAndVariables;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = 0;
        while (people > 0) {

            people -= capacity;
            courses++;
        }

        System.out.println(courses);

    }
}
