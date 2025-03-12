package regexLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "\\b(?<day>\\d{2})([\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";

        //създавам шаблон като за целта използвам регекс
        Pattern pattern = Pattern.compile(regex);
        //мачар ми трябва за да открива попадения по шаблона който съм зъздал
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {

            String day = matcher.group("day"); //String day = matcher.group(1);
            String month = matcher.group("month"); //String month = matcher.group(2)
            String year = matcher.group("year"); //String year = matcher.group(3)

            System.out.printf("Day: %s, Month: %s, Year: %s\n", day, month, year);
        }
    }
}
