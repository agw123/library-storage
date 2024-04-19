import java.util.HashMap;

public class Library {

    Book book;
    HashMap<Integer, Book> books;

    public Library(Book b ) {
        this.books = new HashMap<>();
        books.put(b.getId(), b);
    }


}
