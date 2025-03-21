package examPrep;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder worldTour = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Travel")) {

            //Add Stop - прибавям дестинация
            if (command.contains("Add Stop")) {
                //взимам индекса и дестинацията която трябва да добавим
                int index = Integer.parseInt(command.split(":")[1]);
                String destinationToAdd = command.split(":")[2];

                //валидирам индекса дали е валиден, ако да ще вмъкна спирката на конкретния индекс
                if (index >= 0 && index < worldTour.length()) {
                    worldTour.insert(index, destinationToAdd);
                }

                //премахвам съществуваща дестинация
            } else if (command.contains("Remove Stop")) {
                //взимам начален и краен индекс
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);

                //валидирам индексите
                if (startIndex >= 0 && endIndex < worldTour.length()) {
                    //започвам да премахвам симвулите един по един като започвам от посленидя.
                    for (int position = endIndex; position >= startIndex; position--) {
                        worldTour.deleteCharAt(position);
                    }
                }
            } else if (command.contains("Switch")) {
                //взимам спирките които трябва да заменя
                String oldStop = command.split(":")[1];
                String newStop = command.split(":")[2];

                //ъпдейтнатвам стринга с новата спирка
                String updatedString = worldTour.toString().replace(oldStop, newStop);
                //казвам, че този стринг билдъ, вече ще е равен на стринга който сега имам. (създавам нов стринг билдър със стринга който имам)
                worldTour = new StringBuilder(updatedString);
            }
            //принтирам сегашния статус
            System.out.println(worldTour);

            command = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", worldTour);

    }
}

