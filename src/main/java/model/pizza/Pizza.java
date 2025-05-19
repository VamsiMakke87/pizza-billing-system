package model.pizza;

import model.pizza.price.PriceStrategy;

public abstract class Pizza {

    public abstract PriceStrategy getPriceStrategy();
    public abstract double getPrice();

    public abstract String getDescription();
}
