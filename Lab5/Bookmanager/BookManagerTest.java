package Lab5.Bookmanager;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BookManagerTest {

    private BookManager manager;

    // Runs before EACH test
    @Before
    public void setUp() {
        manager = new BookManager();
    }

    // ✅ Test adding new book
    @Test
    public void testAddBook() {
        manager.addBook(new Book("48 Laws of Power", "I103", 300));
        assertEquals(1, manager.getBookCount());
    }

    // ✅ Test updating existing book
    @Test
    public void testUpdateBook() {
        manager.addBook(new Book("Harry Potter", "I102", 1200));

        manager.updateBook(0,
                new Book("Harry Potter and the Philosopher's Stone", "I102", 1500));

        assertEquals("Harry Potter and the Philosopher's Stone",
                manager.getBook(0).getTitle());
        assertEquals(1500, manager.getBook(0).getPages());
    }

    // ✅ Test deleting a book
    @Test
    public void testDeleteBook() {
        manager.addBook(new Book("Book A", "I001", 200));
        manager.addBook(new Book("Book B", "I002", 300));

        manager.deleteBook(0);

        assertEquals(1, manager.getBookCount());
        assertEquals("Book B", manager.getBook(0).getTitle());
    }

    // ✅ Test deleting all books
    @Test
    public void testDeleteAllBooks() {
        manager.addBook(new Book("Book A", "I001", 200));
        manager.addBook(new Book("Book B", "I002", 300));

        manager.deleteAllBooks();

        assertEquals(0, manager.getBookCount());
    }

    // Edge case: delete from empty list
    @Test
    public void testDeleteFromEmptyList() {
        manager.deleteBook(0); // should NOT crash
        assertEquals(0, manager.getBookCount());
    }

    // Edge case: update invalid index
    @Test
    public void testUpdateInvalidIndex() {
        manager.updateBook(5, new Book("Test", "I999", 100));
        assertEquals(0, manager.getBookCount());
    }
}
