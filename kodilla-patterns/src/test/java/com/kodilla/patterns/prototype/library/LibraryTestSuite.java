package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {


    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("library 1");
        Book book1 = new Book("Przedwiośnie", "Żeromski", LocalDate.of(1964, 11, 23));
        Book book2 = new Book("Konopielka", "Redliński", LocalDate.of(1973, 01, 13));
        Book book3 = new Book("Kongo", "Hames", LocalDate.of(2001, 01, 01));

        //When
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
