package model.pizza.impl.toppings.veg;

import model.pizza.Pizza;
import model.pizza.price.PriceStrategy;

public class Mushrooms extends Pizza {

    private Pizza pizza;

    private static final double MUSHROOMS = 3;

    private PriceStrategy priceStrategy;

    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
        this.priceStrategy = pizza.getPriceStrategy();
    }

    @Override
    public PriceStrategy getPriceStrategy() {
        return this.priceStrategy;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + priceStrategy.getPrice(MUSHROOMS);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Mushrooms";
    }


}
