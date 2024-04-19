public class Book {

    static int a = 10;
    private int id;
    private String author;
    private String title;

    public Book(int id, String a, String t){
        this.id = id;
        this.author = a;
        this.title = t;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return id +
                ", " + author +
                ", " + title;
    }
}
