package dev.emergent;

public class ISBNFinder {
    public static BookInfo lookup(String ISBN) {

        if (ISBN.length() < 10) {
            return new BookInfo("ISBN must be 10 characters in length");
        } else if (ISBN.length() > 10) {
            return new BookInfo("ISBN must be 10 characters in length");
        } else {
            return new BookInfo("Title not found");
        }
    }
}
