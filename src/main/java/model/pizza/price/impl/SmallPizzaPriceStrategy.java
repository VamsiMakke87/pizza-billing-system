package model.pizza.price.impl;

import model.pizza.PizzaSize;
import model.pizza.price.PriceStrategy;

public class SmallPizzaPriceStrategy extends PriceStrategy {
    @Override
    public PizzaSize getPizzaSize() {
        return PizzaSize.SMALL;
    }

    @Override
    public double getPrice(double price) {
        return price*1.0;
    }
}
