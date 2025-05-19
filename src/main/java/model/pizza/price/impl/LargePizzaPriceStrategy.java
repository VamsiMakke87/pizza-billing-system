package model.pizza.price.impl;

import model.pizza.PizzaSize;
import model.pizza.price.PriceStrategy;

public class LargePizzaPriceStrategy extends PriceStrategy {
    @Override
    public double getPrice(double price) {
        return price*1.5;
    }

    public PizzaSize getPizzaSize() {
        return PizzaSize.LARGE;
    }
}
