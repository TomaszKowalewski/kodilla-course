package com.kodilla.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testBasicPizzaOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), cost);
    }

    @Test
    void testDoubleCheesePizzaOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new DoubleCheesePizzaOrder(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(27.5), cost);
    }

    @Test
    void testAllInPizzaOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new DoubleCheesePizzaOrder(pizzaOrder);
        pizzaOrder = new CapriciosaPizzaOrder(pizzaOrder);
        pizzaOrder = new HawaiPizzaOrder(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(38.5), cost);
    }
}
