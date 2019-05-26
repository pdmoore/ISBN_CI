package dev.emergent;

import org.junit.Assert;
import org.junit.Test;

public class ISBN10Tests {

    @Test
    public void ISBN_shorterThan10Characters_ReturnsInvalidBookInfo() {

        // Arrange
        String shortISBN = "12345";

        // Act
        BookInfo actual = ISBNFinder.lookup(shortISBN);

        Assert.assertEquals("ISBN must be 10 characters in length", actual.title);
    }
}
