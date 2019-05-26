package dev.emergent;

public class ISBNFinder {
    public static BookInfo lookup(String ISBN) {

        if (ISBN.length() < 10) {
            return new BookInfo("ISBN must be 10 characters in length");
        } else if (ISBN.length() > 10) {
            return new BookInfo("ISBN must be 10 characters in length");
        } else {

            // SERVICE LOOKUP HERE
            if ("0321146530".equals(ISBN)) {
                return new BookInfo("Test Driven Development by Example", "Kent Beck", "0321146530", "9780321146533");
            }

            return new BookInfo("Title not found");
        }
    }
}
