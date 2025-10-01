package booksanalysis.model;
import lombok.Getter;
@Getter
public class Book {
    private String title;
    private String author;
    private String genre;
    private int yearPublication;

    public Book(String title, String author, String genre, int yearPublication) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearPublication = yearPublication;
    }
}
