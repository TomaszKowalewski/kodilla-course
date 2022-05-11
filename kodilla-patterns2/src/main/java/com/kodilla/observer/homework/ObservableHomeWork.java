package com.kodilla.observer.homework;

public interface ObservableHomeWork {
    void registerMentor(ObserverHomeWork mentor);
    void removeMentor(ObserverHomeWork mentor);
    void notifyObservers();
}
