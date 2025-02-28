package map;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> courses = new LinkedHashMap<>();
        while (!input.equals("end")) {

            String courseName = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            //проверявам дали нямам такъв курс
            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }

            courses.get(courseName).add(student);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {

            String courseName = entry.getKey();
            List<String> studentsNames = entry.getValue();

            System.out.println(courseName + ": " + studentsNames.size());

            studentsNames.forEach(name -> System.out.println("-- " + name));
        }
/*
        courses.forEach((key, value) -> {
            System.out.println(key + ": " + value.size());
            value.forEach(student -> System.out.println("-- " + student));
        });*/
    }
}
