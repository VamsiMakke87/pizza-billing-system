package model.pizza.impl.toppings.veg;

import model.pizza.Pizza;
import model.pizza.price.PriceStrategy;

public class Jalapenos extends Pizza {

    private Pizza pizza;

    private static final double JALAPENOS = 2;

    private PriceStrategy priceStrategy;

    public Jalapenos(Pizza pizza, PriceStrategy priceStrategy) {
        this.pizza = pizza;
        this.priceStrategy = pizza.getPriceStrategy();
    }

    @Override
    public PriceStrategy getPriceStrategy() {
        return this.priceStrategy;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + priceStrategy.getPrice(JALAPENOS);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Jalapenos";
    }


}
