package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class DoubleCheesePizzaOrder extends AbstractPizzaOrderDecorator {
    protected DoubleCheesePizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7.5));
    }

    @Override
    public String getName() {
        return super.getName() + " cheese";
    }
}
