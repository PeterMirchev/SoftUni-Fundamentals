package list;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = new ArrayList<>(Arrays
                .stream(scanner.nextLine().split("\\|"))
                .toList());

        Collections.reverse(input);

        System.out.println(input.toString() //"[  7  8, 4 5 6 , 1 2 3 ]"
                .replace("[", "") //"  7  8, 4 5 6 , 1 2 3 ]"
                .replace("]", "") //"  7  8, 4 5 6 , 1 2 3 "
                .trim()  //"7  8, 4 5 6 , 1 2 3"
                .replaceAll(",", "") //"7  8 4 5 6  1 2 3"
                .replaceAll("\\s+", " ")); //"7 8 4 5 6 1 2 3"

    }
}
