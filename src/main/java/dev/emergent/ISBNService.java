package dev.emergent;

public class ISBNService implements BookInfoProvider {

    private static BookInfoProvider singleton = null;

    public static BookInfoProvider getInstance() {
        if (singleton == null) {
            singleton = new ISBNService();
        }

        return singleton;
    }

    private ISBNService() {
        // private constructor
    }

    public BookInfo retrieve(String isbn) {
        if ("0321146530".equals(isbn)) {
            return new BookInfo("Test Driven Development by Example", "Kent Beck", "0321146530", "9780321146533");
        }

        return null;
    }
}
