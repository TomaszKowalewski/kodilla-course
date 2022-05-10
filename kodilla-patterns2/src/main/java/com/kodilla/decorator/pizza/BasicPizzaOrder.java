package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(20.0);
    }

    @Override
    public String getName() {
        return "Create pizza";
    }
}
