package jobsheet15;

public class Book22 {
    public String isbn;
    public String title;

    public Book22() {
    }

    public Book22(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}
