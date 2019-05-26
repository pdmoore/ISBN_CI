package dev.emergent;

import java.util.HashMap;

public class ISBNService implements BookInfoProvider {

    private static BookInfoProvider singleton = null;
    private final HashMap<String, BookInfo> booksByIsbn10;

    public static BookInfoProvider getInstance() {
        if (singleton == null) {
            singleton = new ISBNService();
        }

        return singleton;
    }

    private ISBNService() {
        // private constructor
        booksByIsbn10 = new HashMap<String, BookInfo>();

        BookInfo bi = new BookInfo("Test Driven Development by Example", "Kent Beck", "0321146530", "9780321146533");
        booksByIsbn10.put(bi.isbn10(), bi);

        bi = new BookInfo("Refactoring", "Martin Fowler", "0201485672", "9780201485677");
        booksByIsbn10.put(bi.isbn10(), bi);

        bi = new BookInfo("Refactoring 2nd Edition", "Martin Fowler", "0134757599", "9780134757599");
        booksByIsbn10.put(bi.isbn10(), bi);

        bi = new BookInfo("Working Effectively with Legacy Code", "Michael Feathers", "0131177052", "9780131177055");
        booksByIsbn10.put(bi.isbn10(), bi);

        bi = new BookInfo("Accelerate", "Forsgren, Humble, Kim", "1942788339", "9781942788331");
        booksByIsbn10.put(bi.isbn10(), bi);
    }

    public BookInfo retrieve(String isbn) {
        return booksByIsbn10.get(isbn);
    }
}
