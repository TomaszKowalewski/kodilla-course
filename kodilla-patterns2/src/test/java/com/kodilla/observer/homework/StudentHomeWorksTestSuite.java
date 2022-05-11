package com.kodilla.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentHomeWorksTestSuite {

    @Test
    void testUpdate() {
        //Given
        StudentHomeWorks antek = new StudentHomeWorks("Antek Królikowski");
        StudentHomeWorks kazik = new StudentHomeWorks("Kazik Staszewski");
        StudentHomeWorks krzyś = new StudentHomeWorks("Krzysztof Skiba");
        MentorHomeWork gośka = new MentorHomeWork("Małgorzata Rozenek");
        MentorHomeWork kubuś = new MentorHomeWork("Kuba Wojedwódzki");
        antek.registerMentor(gośka);
        kazik.registerMentor(kubuś);
        krzyś.registerMentor(gośka);
        //When
        antek.addHomeWork("Where are my girls?");
        antek.addHomeWork("Have You got some an alcohol?");
        kazik.addHomeWork("Twelve groszy");
        krzyś.addHomeWork("Makumba");
        //Then
        assertEquals(gośka.getUpdatesCount(), 3);
        assertEquals(kubuś.getUpdatesCount(),1);
    }
}
