package dev.emergent;

public class ISBNFinder {
    public static BookInfo lookup(String ISBN) {
        return new BookInfo("ISBN must be 10 characters in length");
    }
}
