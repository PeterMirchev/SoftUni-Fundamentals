package map;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> companiesAndEmployees = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String employee = input.split(" -> ")[1];

            if(companiesAndEmployees.containsKey(company) && companiesAndEmployees.get(company).contains(employee)) {
                input = scanner.nextLine();
                continue;
            } else if (companiesAndEmployees.containsKey(company) && !companiesAndEmployees.get(company).contains(employee)){
                companiesAndEmployees.get(company).add(employee);
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(employee);
                companiesAndEmployees.put(company, employees);
            }

            input = scanner.nextLine();
        }

       /* for (Map.Entry<String,List<String>> entry : companiesAndEmployees.entrySet()) {
            System.out.println(entry.getKey());
            for (String employee : entry.getValue()) {
                System.out.println("-- " + employee);
            }
        }*/

        companiesAndEmployees.forEach((key, value) -> {
            System.out.println(key);
            value.forEach( employee -> System.out.println("-- " + employee));
        });
    }
}
