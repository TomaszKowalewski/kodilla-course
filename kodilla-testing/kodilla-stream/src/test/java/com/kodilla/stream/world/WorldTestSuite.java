package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        //Given
        Country poland = new Country("Poland", new BigDecimal("48000000"));
        Country germany = new Country("Germany", new BigDecimal ("78000000"));

        Country japan = new Country("Japan", new BigDecimal("30000000"));
        Country china = new Country("China", new BigDecimal("1300000000"));

        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(germany);

        Continent asia = new Continent();
        asia.addCountry(japan);
        asia.addCountry(china);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);

        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("1456000000");
        Assertions.assertEquals(expectedPopulation, totalPopulation);
    }
}
