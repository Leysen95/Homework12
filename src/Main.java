import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("Aleksandr", "Pushkin");
        Author author1 = new Author("Lev", "Tolstoy");
        Book book = new Book("Onegin", author, 1833);
        Book book1 = new Book("War and Peace", author1, 1867);


        System.out.println(book.getYear());
        book.setYear(1980);
        System.out.println(book.getYear());

        System.out.println(Objects.equals(book,book1));
    }
}
