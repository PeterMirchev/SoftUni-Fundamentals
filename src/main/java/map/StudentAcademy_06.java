package map;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> studentsAndGrades = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (studentsAndGrades.containsKey(name)) {
                studentsAndGrades.get(name).add(grade);
            } else {
                List<Double> grades = new ArrayList<>();
                grades.add(grade);
                studentsAndGrades.put(name, grades);
            }
        }

        /*for (Map.Entry<String, List<Double>> entry : studentsAndGrades.entrySet()) {
            double avgGrade = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                avgGrade += entry.getValue().get(i);
            }

            avgGrade = avgGrade / entry.getValue().size();
            if (avgGrade >= 4.5) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), avgGrade);
            }
        }*/

        studentsAndGrades.entrySet()
                .stream().filter( k -> {
                    double grades = k.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .sum();
                    return grades / k.getValue().size() >= 4.5;
                })
                .forEach(k -> {
                    double grades = k.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .sum();
                    System.out.printf("%s -> %.2f%n", k.getKey(), grades / k.getValue().size());
                });
        /*studentsAndGrades.entrySet()
                .stream()
                .filter(entry -> {
                    // Calculate the average grade for the filter condition
                    double average = entry.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .orElse(0.0);
                    return average >= 4.5; // Keep only students with an average >= 4.5
                })
                .forEach(entry -> {
                    // Reuse the filter condition's logic for clarity but inlined for output
                    double average = entry.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .orElse(0.0);
                    System.out.printf("%s -> %.2f%n", entry.getKey(), average);
                });*/
    }

}

