package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {

        //Given
        TaskList taskList = new TaskList("TaskList 1", "List Description");
        taskListDao.save(taskList);
        String expected = "List Description";

        //When
        List<TaskList> readTaskList = taskListDao.findByListName("TaskList 1");
        String actual = readTaskList.get(0).getDescription();

        //Then
        assertEquals(expected, actual);

        //Clean up
        taskListDao.delete(taskList);
    }
}
