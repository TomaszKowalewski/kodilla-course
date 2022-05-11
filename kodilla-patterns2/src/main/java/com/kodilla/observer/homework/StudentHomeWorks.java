package com.kodilla.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentHomeWorks implements ObservableHomeWork {
    private final List<ObserverHomeWork> observers;
    private final List<String> homeWorks;
    private final String name;

    public StudentHomeWorks(String name) {
        this.observers = new ArrayList<>();
        this.homeWorks = new ArrayList<>();
        this.name = name;
    }

    public void addHomeWork(String string) {
        homeWorks.add(string);
        notifyObservers();
    }

    @Override
    public void registerMentor(ObserverHomeWork mentor) {
        observers.add(mentor);
    }

    @Override
    public void removeMentor(ObserverHomeWork mentor) {
        observers.remove(mentor);
    }

    @Override
    public void notifyObservers() {
        for (ObserverHomeWork observer : observers) {
            observer.update(this);
        }
    }

    public List<ObserverHomeWork> getObservers() {
        return observers;
    }

    public List<String> getHomeWorks() {
        return homeWorks;
    }

    public String getName() {
        return name;
    }
}
