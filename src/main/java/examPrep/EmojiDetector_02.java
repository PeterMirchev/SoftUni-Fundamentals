package examPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //  (:{2}|\*{2})[A-Z][a-z]{2,}\1
        String regex = "(:{2}|\\*{2})[A-Z][a-z]{2,}\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> emojis = new ArrayList<>();
        while (matcher.find()) {
            //взимам си намереното емоджи и го добавям е лист.
            emojis.add(matcher.group());
        }

        // изчислявам coolThreshold като умножавам всички намерени числа в input
        long coolThreshold = 1;
        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {
                coolThreshold *= Character.getNumericValue(symbol);
            }
        }

        //калкулирам емоджитата
        List<String> coolEmojis = new ArrayList<>();
        for (String emoji : emojis) {
            int coolness = 0;
            // Sum ASCII values of the emoji (excluding the boundary markers)
            for (int position = 2; position < emoji.length() - 2; position++) {
                coolness += emoji.charAt(position);
            }
            // добавям емоджито ако има достатъчно восок праг на "coolness"
            if (coolness >= coolThreshold) {
                coolEmojis.add(emoji);
            }
        }

        // Output the results as specified
        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(emojis.size() + " emojis found in the text. The cool ones are:");
        for (String coolEmoji : coolEmojis) {
            System.out.println(coolEmoji);
        }
    }
}
