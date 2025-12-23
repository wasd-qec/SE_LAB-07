package Lab5.Bookmanager;

public class Book {

    private String title;
    private String id;
    private int pages;

    public Book(String title, String id, int pages) {
        this.title = title;
        this.id = id;
        this.pages = pages;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public int getPages() {
        return pages;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book [Title=" + title + ", ID=" + id + ", Pages=" + pages + "]";
    }
}
