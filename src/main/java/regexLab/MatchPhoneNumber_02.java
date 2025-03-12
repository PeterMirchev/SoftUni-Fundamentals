package regexLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        //създавам регекс
        String regex = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";

        //създавам шаблон като за целта използвам регекс
        Pattern pattern = Pattern.compile(regex);
        //мачар ми трябва за да открива попадения по шаблона който съм зъздал
        Matcher matcher = pattern.matcher(text);

        List<String> validNumbers = new ArrayList<>();
        //matcher.find() -> true or false ако намери следващо съвпадение
        while (matcher.find()) {
            validNumbers.add(matcher.group());
        }

        //със String.join() взимам всички елементи и ги оринтирам разделени със запетая на конзолата.
        System.out.println(String.join(", ", validNumbers));

    }
}
