package by.htp.les06.book;

public class Test {
    public static void main(String[] args) {
        BookStore store = new BookStore();
        BookLogic finder = new BookLogic();
        Book book = new Book("Java", "Schildt", "ProgrammingWorld", 450, 1990);
        Book book1 = new Book("С++", "Schildt", "ProgrammingWorld", 800, 2021);
        Book book2 = new Book("JavaScript", "Eih", "Idlers", 300, 2015);
        Book book3 = new Book("C#", "Hejlsburg", "Idlers", 600, 1976);
        Book book4 = new Book("Python", "VanRossum", "Spineless", 350, 1995);
        store.add(book);
        store.add(book1);
        store.add(book2);
        store.add(book3);
        store.add(book4);

        store.sort(store);
        //System.out.println(store.getLibrary());
        System.out.println("//1");
        System.out.println(finder.findAuthor(store, "Schildt"));
        System.out.println("//2");
        System.out.println(finder.findPublishing(store, "Idlers"));
        System.out.println("//3");
        System.out.println(finder.findByYear(store, 1976));


    }
}
