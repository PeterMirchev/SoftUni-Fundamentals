package objects.orderByAge_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String name = input.split("\\s+")[0];
            String id = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);

            Person person = new Person(name, id, age);
            personList.add(person);

            input = scanner.nextLine();
        }

        personList.sort(Comparator.comparing(Person::getAge));
        personList.forEach(System.out::println);
    }
}
