package by.htp.les06.book;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {
    public List<Book> findAuthor(BookStore list, String name) {
        List<Book> author;
        List<Book> bookInfo = new ArrayList<>();
        author = list.getLibrary();
        for (Book find : author) {
            if (find.getAuthor().equals(name)) {
                bookInfo.add(find);
            }
        }
        return bookInfo;
    }

    public List<Book> findPublishing(BookStore list, String house) {
        List<Book> publishingHouse;
        List<Book> result = new ArrayList<>();
        publishingHouse = list.getLibrary();
        for (Book ph : publishingHouse) {
            if (ph.getPublishingHouse().equals(house)) {
                result.add(ph);
            }
        }
        return result;
    }

    public List<Book> findByYear(BookStore list, Integer year) {
        List<Book> yearList;
        List<Book> result = new ArrayList<>();
        yearList = list.getLibrary();
        for (Book b : yearList) {
            if (b.getYear() > year) {
                result.add(b);
            }
        }
        return result;
    }
}
