package com.kodilla.patterns.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User killer = new YGeneration("Killer");
        User snoopDog = new ZGeneration("snoopDog");
        User sting = new Millenials("Sting");

        //When
        String killerShare = killer.share("what will You do me, if You catch me?");
        String snoopDogShare = snoopDog.share("yo, yo, yo gangsta");
        String stingShare = sting.share("desert rose");

        //Then
        assertEquals("the post [what will You do me, if You catch me?] shared on: Facebook", killerShare);
        assertEquals("the post [yo, yo, yo gangsta] shared on: Snapchat", snoopDogShare);
        assertEquals("the post [desert rose] shared on: Twitter",stingShare);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User helmut = new YGeneration("Helmut");
        helmut.setSocialPublishingStrategy(new SnapchatPublisher());

        //When
        String helmutShare =  helmut.share("kaine grenzen");

        //Then
        assertEquals("the post [kaine grenzen] shared on: Snapchat", helmutShare);
    }
}