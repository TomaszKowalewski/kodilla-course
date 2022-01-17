package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    void testToString() {

            //given
            //creating the TasksList for todos
            TasksList listToDo = new TasksList("To Do Tasks");
            IntStream.iterate(1, n -> n + 1)
                    .limit(10)
                    .forEach(n -> listToDo.getTasks().add(new Task("To Do Task number " + n)));

            //creating the TaskList for tasks in progress
            TasksList listInProgress = new TasksList("In Progress Tasks");
            IntStream.iterate(1, n -> n + 1)
                    .limit(10)
                    .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Task number " + n)));

            //creating the TaskList for done tasks
            TasksList listDone = new TasksList("Done Tasks");
            IntStream.iterate(1, n -> n + 1)
                    .limit(10)
                    .forEach(n -> listDone.getTasks().add(new Task("Done Task number " + n)));

            //creating the board and assigning the lists
            Board board = new Board("Project number 1");
            board.getLists().add(listToDo);
            board.getLists().add(listInProgress);
            board.getLists().add(listDone);
            System.out.println(board);

            //making a shallow clone of object board
            Board cloneBoard = null;
            try {
                cloneBoard = board.shallowCopy();
                cloneBoard.setName("Project number 2");
            } catch (CloneNotSupportedException e) {
                System.out.println(e);
            }

            //When
            //NEW: removing elements
            board.getLists().remove(listToDo);

            //Then
            assertEquals(3, board.getLists().size());
            assertEquals(3, cloneBoard.getLists().size());
        }
    }