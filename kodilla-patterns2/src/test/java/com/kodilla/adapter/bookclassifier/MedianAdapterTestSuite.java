package com.kodilla.adapter.bookclassifier;

import com.kodilla.adapter.bookclasifier.MedianAdapter;
import com.kodilla.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Book book = new Book("Cyprian Kamil Baczyński", "Cierpienia młodego Vertera", 1953, "signature");
        Book book1 = new Book("Blanka Lipińska", "363 nocy", 2015, "signature");
        Book book2 = new Book("Szczepan Twardoch", "Król", 2016, "signature");
        Set<Book> books = new HashSet<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        double median = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(median,2015);
    }
}