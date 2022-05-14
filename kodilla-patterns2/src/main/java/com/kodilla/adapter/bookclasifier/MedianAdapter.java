package com.kodilla.adapter.bookclasifier;

import com.kodilla.adapter.bookclasifier.librarya.Book;
import com.kodilla.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>();
        for(Book book : bookSet){
            bookMap.put(new BookSignature(book.getSignature()), new com.kodilla.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return medianPublicationYear(bookMap);
    }
}
