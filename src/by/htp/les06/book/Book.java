package by.htp.les06.book;

public class Book implements Comparable<Book> {
    private Integer id;
    private String title;
    private String author;
    private String publishingHouse;
    private Integer year;
    private Integer pages;
    private Integer price;
    private String bind;


    public Book(Integer id, String title, String author, String publishingHouse, Integer year, Integer pages, Integer price, String bind) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.bind = bind;
    }

    public Book(String title, String author, String publishingHouse,Integer price, Integer year) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.price = price;
        this.year = year;

    }

    public Book() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBind() {
        return bind;
    }

    public void setBind(String bind) {
        this.bind = bind;
    }

    @Override
    public String toString() {
        return '\n' + "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", bind='" + bind + '\'' +
                '}' + '\n';
    }

    @Override
    public int compareTo(Book o) {
        int resultOfCompare = this.author.compareTo(o.getAuthor());
        if (resultOfCompare == 0) {
            return price.compareTo(o.getPrice());
        } else {
            return resultOfCompare;
        }
    }
}
