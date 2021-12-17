package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String [] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try { secondChallenge.probablyIWillThrowException(10.0, 1.5);

        } catch (Exception e) {
            System.out.println("Wystąpił błąd");

        } finally {
            System.out.println("koniec programu");
        }
    }
}

