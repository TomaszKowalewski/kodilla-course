package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class CapriciosaPizzaOrder extends AbstractPizzaOrderDecorator {
    protected CapriciosaPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5.0));
    }

    @Override
    public String getName() {
        return super.getName() + " mushrooms";
    }
}
