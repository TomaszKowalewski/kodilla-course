package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
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

    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn with hibernate", 14);
        Task task2 = new Task("Test: Write smome entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("LISTNAME", "To do tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertEquals(110, id);

        //CleanUp
        taskListDao.deleteById(id);
    }
}

