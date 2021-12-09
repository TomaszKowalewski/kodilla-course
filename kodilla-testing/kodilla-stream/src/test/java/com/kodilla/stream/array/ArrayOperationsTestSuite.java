package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){

        //Given
        int numbers[] = {1, 2, 3, 4, 5};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(3, average, 0.1);
    }
}
