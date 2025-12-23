package Lab5.Bookmanager;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<Book> books = new ArrayList<>();

    // Add new book
    public void addBook(Book book) {
        books.add(book);
    }

    // List all books
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + ": " + books.get(i));
        }
    }

    // Update existing book by index
    public void updateBook(int index, Book book) {
        if (index >= 0 && index < books.size()) {
            books.set(index, book);
        } else {
            System.out.println("Invalid index for update.");
        }
    }

    // Delete a book by index
    public void deleteBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
        } else {
            System.out.println("Invalid index for delete.");
        }
    }

    // Delete all books
    public void deleteAllBooks() {
        books.clear();
    }
     public int getBookCount() {
        return books.size();
    }

    public Book getBook(int index) {
        return books.get(index);
    }
}

