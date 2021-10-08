package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    @BeforeEach
    public void beforeEach(){
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void afterEach(){ System.out.println("Test Case: end"); }
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suite: begin");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Test Suite: end");
    }

   @Test
   public  void testAddFigure(){
        //Given
       ShapeCollector shapeCollector = new ShapeCollector();
       Shape shape = new Square(3);
       //When
       shapeCollector.addFigure(shape);
       //Then
       Assertions.assertEquals(1, shapeCollector.getShapeCollection().size());
   }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(3);
        //When
        shapeCollector.removeFigure(shape);
        //Then
        Assertions.assertEquals(0, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(3);

        shapeCollector.addFigure(shape);
        //When
        Shape result = shapeCollector.getFigure(0);

        //Then
        Assertions.assertEquals(shape , result);
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(3);
        shapeCollector.addFigure(shape);
        //When
        shapeCollector.showFigures();
        //Then

    }
}

