package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTest {

    @Test
    void probablyIWillThrowException() {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.0, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.1, 1.6)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 7.0)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 2.0)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 1.499))
        );
    }
}