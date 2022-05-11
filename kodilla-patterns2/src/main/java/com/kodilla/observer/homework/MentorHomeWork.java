package com.kodilla.observer.homework;

public class MentorHomeWork implements ObserverHomeWork {
    private final String name;
    private int updatesCount;

    public MentorHomeWork(String name) {
        this.name = name;
        updatesCount = 0;
    }

    @Override
    public void update(StudentHomeWorks student) {
        System.out.println(name + " You have " + student.getHomeWorks().size() + " homeworks completed from " + student.getName());
        updatesCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdatesCount() {
        return updatesCount;
    }
}
