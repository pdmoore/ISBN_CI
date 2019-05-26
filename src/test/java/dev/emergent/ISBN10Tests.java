package dev.emergent;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ISBN10Tests {

    @Test
    public void ISBN_shorterThan10Characters_ReturnsInvalidBookInfo() {

        // Arrange
        String shortISBN = "12345";

        // Act
        BookInfo actual = ISBNFinder.lookup(shortISBN);

        // Assert
        assertEquals("ISBN must be 10 characters in length", actual.title);
    }

    @Test
    public void ISBN_longerThan10Characters_ReturnsInvalidBookInfo() {

        // Arrange
        String longISBN = "1234567890BCDEF";

        // Act
        BookInfo actual = ISBNFinder.lookup(longISBN);

        // Assert
        assertEquals("ISBN must be 10 characters in length", actual.title);
    }

    @Test
    public void ISBN_BookNotFound() {

        String unknownISBN = "0553562614";

        BookInfo actual = ISBNFinder.lookup(unknownISBN);

        assertEquals("Title not found", actual.title);
    }

    @Test
    public void ISBN_BookFound() {
        String ISBN = "0321146530";

        BookInfo actual = ISBNFinder.lookup(ISBN);

        BookInfo expected = new BookInfo("Test Driven Development by Example", "Kent Beck", "0321146530", "9780321146533");

        assertEquals(expected.toString(), actual.toString());
    }
}
