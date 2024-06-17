public class Main {
    public static void main(String[] args) {

        Book book = new Book("Onegin", "Pushkin Aleksandr", 1833);
        Book book1 = new Book("War and Peace", "Tolstoy Lev", 1867);
        Author author = new Author("Aleksandr", "Pushkin");
        Author author1 = new Author("Lev", "Tolstoy");

        System.out.println(book.getYear());
        book.setYear(1980);
        System.out.println(book.getYear());
        System.out.println(book.getAuthor());
    }
}