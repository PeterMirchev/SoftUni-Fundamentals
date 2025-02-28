package map;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> teams = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {

                String teamName = input.split(" \\| ")[0];
                String playerName = input.split(" \\| ")[1];

                //1. ако няма такъв отбор, създаваме нов с празен списък от играчи
                if (!teams.containsKey(teamName)) {
                    teams.put(teamName, new ArrayList<>());
                }

                //2. проверявам дали такъв играч, вече фигурира в друг отбор
                boolean isThisPlayerPartOfAnotherTeam = false;
                //teams.values().for -> връща списък с всички валюта от мапа - дава ми всички листове заедно
                for (List<String> team : teams.values()) {
                    if (team.contains(playerName)) {
                        isThisPlayerPartOfAnotherTeam = true;
                        break;
                    }
                }

                //3. ако не фигурира към друг отбор, ще го провабим към този
                if (!isThisPlayerPartOfAnotherTeam) {
                    teams.get(teamName).add(playerName);
                }

            } else if (input.contains("->")) {

                String playerName = input.split(" -> ")[0];
                String teamName = input.split(" -> ")[1];

                //1. обхождам всочки отбори и премахвам играча от текущия му отбор
                //teams.values().for -> връща списък с всички валюта от мапа - дава ми всички листове заедно
                for (List<String> team : teams.values()) {
                    //тук няма нужда да проверявам дали има такъв играч, защото тази операция премахва елемент, само ако той съществува
                    team.remove(playerName);
                }
                //2. ако няма такъв отбор, създаваме нов отбор с празен списък уи след това добавян играча
                if (teams.containsKey(teamName)) {
                    teams.get(teamName).add(playerName);
                } else {
                    teams.put(teamName, new ArrayList<>());
                    teams.get(teamName).add(playerName);
                }
                System.out.printf("%s joins the %s side!\n", playerName, teamName);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : teams.entrySet()) {

            String teamName = entry.getKey();
            List<String> players = entry.getValue();

            //принтирам само ако имам играчи в отбора
            if(!players.isEmpty()) {
                System.out.printf("Side: %s, Members: %d%n", teamName, players.size());

                players.forEach(player -> System.out.printf("! %s\n", player));
            }
        }
    }
}
