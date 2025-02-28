package objects.articles_02;

public class Article {
    //характеристики - fields
    private String title;
    private String content;
    private String author;

    //public custom constructor
    public Article(String title, String content, String author) {

        this.title = title;
        this.content = content;
        this.author = author;
    }

    //променям съдържанието
    public void edit(String newContent) {

        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        //променям автора
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        //променям заглавието
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", title, content, author);
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }
}
