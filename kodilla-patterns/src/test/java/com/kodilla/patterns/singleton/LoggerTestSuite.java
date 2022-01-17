package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    public void testGetLastLog(){

        Logger logger = Logger.INSTANCE;

        //Given
        //When
        String result = logger.getLastLog();
        System.out.println("The last log has made butcher.");
        //Then
        assertEquals("Butcher", result);
    }



}
