
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(0, "Stefano Benni", "Bar Sport");
        Library library = new Library(book1);
        library.books.put(1, new Book(1, "Lorem", "Ipsum"));
        library.books.put(2, new Audiobook(2, "Ernest Hemingway", "Il lupo della steppa", 230));

        String path = "C:\\Users/Agata/OneDrive/Desktop/JavaOnboarding Accedemia Informatica/esercizi_input_output/library.txt";
        LibraryRepository.createFile(path, library.books);
        LibraryRepository.addBook(path, new Book(3, "Olga Tokarczuk", "Wioska"));


        LibraryRepository.readFile(path);

        Audiobook audiobook = new Audiobook(4, "William Shakespear", "Dramas", 580);

        LibraryRepository.addBook(path, audiobook);

        LibraryRepository.printLibrary(path);
        LibraryRepository.removeBook(path, book1);
        LibraryRepository.printLibrary(path);
    }
}