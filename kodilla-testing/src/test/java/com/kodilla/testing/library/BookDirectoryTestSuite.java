package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionReturnList(){

        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks= new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    void testListBooksWithConditionMoreThen20(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        List<Book> resultListOF15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOF15Books);
        when(libraryDatabaseMock.listBooksWithCondition("Zero Books")).thenReturn(resultListOfBooks);
        when(libraryDatabaseMock.listBooksWithCondition("Forty Books")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(40, theListOfBooks40.size());
    }
    void testListBooksWithConditionFragmentShorterThan3(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0));
        libraryDatabaseMock.listBooksWithCondition(anyString());
    }
    @Test
    void testListBooksInHandsOfRented0() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("firstname", "lastname", "peselID");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(generateListOfNBooks (0));
        //When
        List<Book> rent0 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(0, rent0.size());
    }
    @Test
    void testListBooksInHandsOfRented1() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("firstname", "lastname", "peselID");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(generateListOfNBooks (1));
        //When
        List<Book> rent1 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(1, rent1.size());
    }
    @Test
    void testListBooksInHandsOfRented5() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("firstname", "lastname", "peselID");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(generateListOfNBooks (5));
        //When
        List<Book> rent5 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(5, rent5.size());
    }
}
