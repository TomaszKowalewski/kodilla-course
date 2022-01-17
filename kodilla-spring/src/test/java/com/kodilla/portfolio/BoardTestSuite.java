package com.kodilla.portfolio;

import com.kodilla.spring.portfolio.Board;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    //@Autowired
   // private Board board;
    @Test

    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        //When
        board.getDoneList().getTasks().add("odbyłem rozmowę");
        board.getInProgressList().getTasks().add("uczę się progrmowania");
        board.getToDoList().getTasks().add("maluję obraz");

        //Then
        Assertions.assertEquals(1, board.getToDoList().getTasks().size());
        Assertions.assertEquals(1, board.getInProgressList().getTasks().size());
        Assertions.assertEquals(1, board.getToDoList().getTasks().size());

    }
}
