package by.htp.les06.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookStore {
    private List<Book> library;

    public BookStore() {
        library = new ArrayList<>();
    }

    public void sort(BookStore store) {
        Collections.sort(library);
    }

    public void add(Book book) {
        this.library.add(book);
    }

    public List<Book> getLibrary() {
        return library;
    }

    public void setLibrary(List<Book> library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "library=" + library +
                '}';
    }
}
