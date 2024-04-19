import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LibraryRepository {

    public static void createFile(String path, HashMap<Integer,Book> books) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (Map.Entry<Integer, Book> el : books.entrySet()) {
                bw.write(el.getValue().toString());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static HashMap<Integer, Book> readFile(String path) {
        try {
            HashMap<Integer, Book> books = new HashMap<>();
            BufferedReader br = new BufferedReader(new FileReader(path));
            String s;
            while ((s = br.readLine()) != null) {
                String[] booksList = s.split(",");
                int id = Integer.parseInt(booksList[0]);
                if(booksList.length == 3 ) {
                    books.put(id, new Book(id, booksList[1].trim(), booksList[2].trim()));
                    return books;
                } else if (booksList.length == 4){
                    int d = Integer.parseInt(booksList[3]);
                    books.put(id, new Audiobook(id, booksList[1].trim(), booksList[2].trim(), d));
                    return books;
                }
            }
            br.close();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void addBook(String path, Book b) {
        try {
            HashMap<Integer, Book> newBooks = readFile(path);
            newBooks.put(b.getId(), b);
            createFile(path, newBooks);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String removeBook(String path, Book b) {
        HashMap<Integer, Book> bookList = readFile(path);
        assert bookList != null;
        bookList.remove(b.getId());
        createFile(path, bookList);
        return "Book:" + b + "has been removed.";
    }

    public static void printLibrary(String path){
        HashMap<Integer, Book> printedLibrary = readFile(path);
        System.out.println(printedLibrary);
    }
}

