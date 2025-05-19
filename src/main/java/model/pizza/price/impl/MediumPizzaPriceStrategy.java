package model.pizza.price.impl;

import model.pizza.PizzaSize;
import model.pizza.price.PriceStrategy;

public class MediumPizzaPriceStrategy extends PriceStrategy {
    @Override
    public double getPrice(double price) {
        return price*1.25;
    }

    public PizzaSize getPizzaSize() {
        return PizzaSize.MEDIUM;
    }
}
