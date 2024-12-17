package map;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, LinkedList<String>> coursesAndStudents = new LinkedHashMap<>();
        while (!input.equals("end")) {

            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            if (coursesAndStudents.containsKey(course)) {
                coursesAndStudents.get(course).add(student);
            } else {
                LinkedList<String> students = new LinkedList<>();
                students.add(student);
                coursesAndStudents.put(course, students);
            }
            input = scanner.nextLine();
        }

       /* for (Map.Entry<String, LinkedList<String>> entry : coursesAndStudents.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }*/

        coursesAndStudents.forEach((key, value) -> {
            System.out.println(key + ": " + value.size());
            value.forEach(student -> System.out.println("-- " + student));
        });
    }
}
