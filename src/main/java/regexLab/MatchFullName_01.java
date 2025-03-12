package regexLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "\\b([A-Z][a-z]+) ([A-Z][a-z]+)";

        //създавам шаблон като за целта използвам регекс
        Pattern pattern = Pattern.compile(regex);
        //мачар ми трябва за да открива попадения по шаблона който съм зъздал
        Matcher matcher = pattern.matcher(text);

        //matcher.find() -> true or false ако намери следващо съвпадение
        while (matcher.find()) {

            System.out.print(matcher.group() + " ");
        }
    }
}
