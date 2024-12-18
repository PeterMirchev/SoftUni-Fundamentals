package map;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> groupsAndUsers = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {
                String forceSide = input.split(" \\| ")[0];
                String user = input.split(" \\| ")[1];

                if (groupsAndUsers.containsKey(forceSide) && groupsAndUsers.get(forceSide).contains(user)) {
                    input = scanner.nextLine();
                    continue;
                } else if (groupsAndUsers.containsKey(forceSide) && !groupsAndUsers.get(forceSide).contains(user)) {
                    groupsAndUsers.get(forceSide).add(user);
                } else {
                    List<String> users = new ArrayList<>();
                    users.add(user);
                    groupsAndUsers.put(forceSide, users);
                }
            } else if (input.contains("->")) {
                String user = input.split(" -> ")[0];
                String forceSide = input.split(" -> ")[1];

                removeUserFromForceSide(groupsAndUsers, user);

                if (!groupsAndUsers.containsKey(forceSide)) {
                    List<String> users = new ArrayList<>();
                    users.add(user);
                    groupsAndUsers.put(forceSide, users);
                } else {
                    groupsAndUsers.get(forceSide).add(user);
                }
                System.out.printf("%s joins the %s side!%n", user, forceSide);

            }
            input = scanner.nextLine();
        }

       /* for (Map.Entry<String, List<String>> entry : groupsAndUsers.entrySet()) {

            if (entry.getValue().size() == 0) {
                continue;
            }
            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
            for (String user : entry.getValue()) {
                System.out.println("! " + user);
            }
        }*/

        groupsAndUsers.forEach((k, v) -> {
            if (!v.isEmpty()) {
                System.out.printf("Side: %s, Members: %d%n", k, v.size());
            }
            v.forEach( user -> System.out.println("! " + user));
        });
    }

    private static void removeUserFromForceSide(LinkedHashMap<String, List<String>> groupsAndUsers, String user) {
        for (Map.Entry<String, List<String>> entry : groupsAndUsers.entrySet()) {

            if (entry.getValue().contains(user)) {
                entry.getValue().remove(user);
                break;
            }
        }
    }
}
