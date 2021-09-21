package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public  void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("checking is the method correct if insert empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList () {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(emptyList, resultList);
    }

    @DisplayName("checking is the method correct if insert the numbers")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> normalList = new ArrayList<>();
        List<Integer> expectedResultList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(5);
        normalList.add(8);
        expectedResultList.add(2);
        expectedResultList.add(8);
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");
        //Then
        Assertions.assertEquals(expectedResultList, resultList);
    }
}
