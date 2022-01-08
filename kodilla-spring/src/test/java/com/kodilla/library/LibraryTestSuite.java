package com.kodilla.library;

import com.kodilla.spring.library.Library;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LibraryTestSuite {

    @Autowired
    private Library library;

    @Test
    void testLoadFromDb() {

        //Given

        //When
        library.loadFromDb();

        //Then
        //do nothing
    }
    @Test
    void testLoadToDb(){

        //Given

        //When
        library.saveToDb();

        //Then
        //do nothing
    }
}
