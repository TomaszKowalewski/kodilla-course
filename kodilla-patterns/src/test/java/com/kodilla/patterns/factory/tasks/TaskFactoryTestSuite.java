package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    public void testDrivingTaskFactory() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        boolean isExecuted = driving.isTaskExecuted();

        //Then
        assertEquals("Drive to pub", driving.getTaskName());
    }

    @Test
    public void testShoppingTaskFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        boolean isExecuted = shopping.isTaskExecuted();

        //Then
        assertEquals("Bay an equipment",shopping.getTaskName());
    }

    @Test
    public void testPaintingTaskFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        boolean isExecuted = painting.isTaskExecuted();

        //Then
        assertEquals("Paint the art", painting.getTaskName());

    }
}
