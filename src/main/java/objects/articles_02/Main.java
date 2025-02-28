package objects.articles_02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> articleContent = Arrays
                .stream(scanner.nextLine().split(", "))
                .toList();

        String title = articleContent.get(0);
        String content = articleContent.get(1);
        String author = articleContent.get(2);

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();
            String command = input.split(": ")[0];
            String newContent = input.split(": ")[1];

            if (command.equals("Edit")) {
                //променям съдържанието
                article.edit(newContent);
            } else if (command.equals("ChangeAuthor")) {
                //променям автора
                article.changeAuthor(newContent);
            } else if (command.equals("Rename")) {
                //променям заглавието
                article.rename(newContent);
            }
        }

        System.out.println(article.toString());
        //System.out.printf("%s - %s: %s\n",article.getTitle(), article.getContent(), article.getAuthor());
    }
}
