package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {

        //Given
        Bigmac bigmac = new Bigmac.BigmackBuilder()
                .ingredient("Onion")
                .ingredient("Cucumber")
                .ingredient("Salt")
                .sauce("Barbeque")
                .bun("Sesame")
                .burgers(2)
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(3, howManyIngredients);
    }
}
