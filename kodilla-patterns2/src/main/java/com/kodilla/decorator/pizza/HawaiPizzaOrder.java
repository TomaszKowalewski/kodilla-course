package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class HawaiPizzaOrder extends AbstractPizzaOrderDecorator {
    protected HawaiPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6.0));
    }

    @Override
    public String getName() {
        return super.getName() + " pineapple";
    }
}
